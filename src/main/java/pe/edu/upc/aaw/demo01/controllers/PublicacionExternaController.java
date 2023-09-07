package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demo01.dtos.PublicacionExternaDTO;
import pe.edu.upc.aaw.demo01.entities.PublicacionExterna;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPublicacionExternaService;

@RestController
@RequestMapping("/publicacionexterna")
public class PublicacionExternaController {

    @Autowired
    private IPublicacionExternaService pubextS;

    @PostMapping
    public void registrar(@RequestBody PublicacionExternaDTO dto){
        ModelMapper m=new ModelMapper();
        PublicacionExterna con=m.map(dto, PublicacionExterna.class);
        pubextS.insert(con);
    }
}
