package pe.edu.upc.aaw.demo01.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.LogicRolDTO;
import pe.edu.upc.aaw.demo01.dtos.UserRoleDTO;
import pe.edu.upc.aaw.demo01.entities.LogicRol;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ILogicRolService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/logicrol")
public class LogicRolController {

    @Autowired
    private ILogicRolService LRS;

    @PostMapping
    public void registrar(@RequestBody LogicRolDTO dto) {
        ModelMapper m = new ModelMapper();
        LogicRol lr = m.map(dto, LogicRol.class);
        LRS.insert(lr);
    }

    @PutMapping
    public void modificar(@RequestBody LogicRolDTO dto) {
        ModelMapper m = new ModelMapper();
        LogicRol lr = m.map(dto, LogicRol.class);
        LRS.insert(lr);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        LRS.delete(id);
    }

    @GetMapping("/{id}")
    public LogicRolDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m=new ModelMapper();
        LogicRolDTO dto=m.map(LRS.listarId(id),LogicRolDTO.class);
        return dto;
    }

    @GetMapping
    public List<LogicRolDTO> listar() {
        return LRS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LogicRolDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/logicusers")
    public List<UserRoleDTO> getUserByRole() {
        List<String[]> countUserByRole = LRS.getCountUserByRole();
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
