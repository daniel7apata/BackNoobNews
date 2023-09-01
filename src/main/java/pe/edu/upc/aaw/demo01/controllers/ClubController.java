package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.ClubDTO;
import pe.edu.upc.aaw.demo01.entities.Club;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IClubService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clubes")
public class ClubController {

    @Autowired
    private IClubService cS;

    @PostMapping
    public void registrar(@RequestBody ClubDTO dto){
        ModelMapper m=new ModelMapper();
        Club c=m.map(dto,Club.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ClubDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClubDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ClubDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ClubDTO dto=m.map(cS.listId(id),ClubDTO.class);
        return dto;
    }

    @PostMapping("/buscar")
    public List<ClubDTO> buscar(@RequestBody LocalDate fecha){
        return cS.findByCreationDateClub(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClubDTO.class);
        }).collect(Collectors.toList());
    }

}
