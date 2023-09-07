package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.InteraccionDTO;
import pe.edu.upc.aaw.demo01.entities.Interaccion;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IInteraccionService;

@RestController
@RequestMapping("/interaccion")
public class InteraccionController {

    @Autowired
    private IInteraccionService intS;

    @PostMapping
    public void registrar(@RequestBody InteraccionDTO dto){
        ModelMapper m=new ModelMapper();
        Interaccion con=m.map(dto, Interaccion.class);
        intS.insert(con);
    }

}
