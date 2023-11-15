package pe.edu.upc.aaw.demo01.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.InteractionUsersDTO;
import pe.edu.upc.aaw.demo01.dtos.LogicUserDTO;
import pe.edu.upc.aaw.demo01.entities.LogicUser;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ILogicUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/logicuser")
public class LogicUserController {

    @Autowired
    private ILogicUserService LUS;

    @PostMapping
    public void registrar(@RequestBody LogicUserDTO dto) {
        ModelMapper m = new ModelMapper();
        LogicUser lu = m.map(dto, LogicUser.class);
        LUS.insert(lu);
    }

    @PutMapping
    public void modificar(@RequestBody LogicUserDTO dto) {
        ModelMapper m = new ModelMapper();
        LogicUser lu = m.map(dto, LogicUser.class);
        LUS.insert(lu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        LUS.delete(id);
    }

    @GetMapping("/{id}")
    public LogicUserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m=new ModelMapper();
        LogicUserDTO dto=m.map(LUS.listarId(id),LogicUserDTO.class);
        return dto;
    }

    @GetMapping
    public List<LogicUserDTO> listar() {
        return LUS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LogicUserDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/interactions")
    public List<InteractionUsersDTO> getCountInteractionByUsers() {
        List<String[]> countInteractionByUsers = LUS.getCountInteractionByUsers();
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
