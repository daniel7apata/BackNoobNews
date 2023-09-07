package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demo01.dtos.UniversidadDTO;
import pe.edu.upc.aaw.demo01.entities.Universidad;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUniversidadService;

@RestController
@RequestMapping("/universidad")
public class UniversidadController {

    @Autowired
    private IUniversidadService uniS;

    @PostMapping
    public void registrar(@RequestBody UniversidadDTO dto){
        ModelMapper m=new ModelMapper();
        Universidad c=m.map(dto,Universidad.class);
        uniS.insert(c);
    }
}
