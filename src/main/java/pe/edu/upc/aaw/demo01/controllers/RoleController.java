package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.PublicationDTO;
import pe.edu.upc.aaw.demo01.dtos.RoleDTO;
import pe.edu.upc.aaw.demo01.dtos.UserRoleDTO;
import pe.edu.upc.aaw.demo01.dtos.UserUniversityDTO;
import pe.edu.upc.aaw.demo01.entities.Role;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IRoleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService rU;

    @PostMapping
    public void registrar(@RequestBody RoleDTO dto){
        ModelMapper m=new ModelMapper();
        Role t=m.map(dto, Role.class);
        rU.insert(t);
    }


    @GetMapping
    public List<RoleDTO> listar(){
        return rU.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rU.delete(id);
    }


    @GetMapping("/{id}")
    public RoleDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RoleDTO dto=m.map(rU.listId(id), RoleDTO.class);
        return dto;
    }

    @GetMapping("/users")
    public List<UserRoleDTO> getUserByRole() {
        List<String[]> countUserByRole = rU.getCountUserByRole();
        List<UserRoleDTO> userRoleDTOlist = new ArrayList<>();

        for (String[] data : countUserByRole) {
            if (data.length >= 2) {
                UserRoleDTO userRoleDTO = new UserRoleDTO();
                userRoleDTO.setDescription(data[0]);
                userRoleDTO.setQuantityUser(Integer.parseInt(data[1]));
                userRoleDTOlist.add(userRoleDTO);
            }
        }

        return userRoleDTOlist;
    }




}
