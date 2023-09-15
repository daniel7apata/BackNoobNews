package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.UsersDTO;
import pe.edu.upc.aaw.demo01.entities.Users;
import pe.edu.upc.aaw.demo01.dtos.InteractionUsersDTO;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUsersService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private IUsersService usS;

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto){
        ModelMapper m=new ModelMapper();
        Users u=m.map(dto, Users.class);
        usS.insert(u);
    }


    @GetMapping("/listartodo")
    public List<UsersDTO> listar(){
        return usS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        usS.delete(id);
    }


    @GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsersDTO dto=m.map(usS.listId(id), UsersDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsersDTO dto){
        ModelMapper m=new ModelMapper();
        Users c=m.map(dto,Users.class);
        usS.insert(c);
    }

    @GetMapping("/interactions")
    public List<InteractionUsersDTO> getCountInteractionByUsers() {
        List<String[]> countInteractionByUsers = usS.getCountInteractionByUsers();
        List<InteractionUsersDTO> interactionUsersDTOList = new ArrayList<>();

        for (String[] data : countInteractionByUsers) {
            if (data.length >= 2) {
                InteractionUsersDTO interactionUsersDTO = new InteractionUsersDTO();
                interactionUsersDTO.setNameUsers(data[0]);
                interactionUsersDTO.setQuantityInteraction(Integer.parseInt(data[1]));
                interactionUsersDTOList.add(interactionUsersDTO);
            }
        }

        return interactionUsersDTOList;
    }

}
