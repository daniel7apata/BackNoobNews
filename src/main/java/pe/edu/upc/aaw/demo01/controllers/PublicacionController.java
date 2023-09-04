package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.ClubDTO;
import pe.edu.upc.aaw.demo01.dtos.PublicacionDTO;
import pe.edu.upc.aaw.demo01.entities.Club;
import pe.edu.upc.aaw.demo01.entities.Publicacion;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPublicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {

    @Autowired
    private IPublicacionService pubR;

    @PostMapping
    public void registrar(@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion c=m.map(dto,Publicacion.class);
        pubR.insert(c);
    }

    @GetMapping
    public List<PublicacionDTO> listar(){
        return pubR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PublicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") Integer id){ pubR.delete(id);}

}
