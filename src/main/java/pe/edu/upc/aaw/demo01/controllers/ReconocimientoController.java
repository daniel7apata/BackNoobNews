package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.ClubDTO;
import pe.edu.upc.aaw.demo01.dtos.ReconocimientoDTO;
import pe.edu.upc.aaw.demo01.entities.Club;
import pe.edu.upc.aaw.demo01.entities.Reconocimiento;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IReconocimientoService;

@RestController
@RequestMapping("/reconocimiento")
public class ReconocimientoController {

    @Autowired
    private IReconocimientoService recR;

    @PostMapping
    public void registrar(@RequestBody ReconocimientoDTO dto){
        ModelMapper m=new ModelMapper();
        Reconocimiento c=m.map(dto,Reconocimiento.class);
        recR.insert(c);
    }

    @GetMapping("/{id}")
    public ReconocimientoDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ReconocimientoDTO dto=m.map(recR.listid(id),ReconocimientoDTO.class);
        return dto;
    }
}
