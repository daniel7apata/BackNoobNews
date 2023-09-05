package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demo01.dtos.InteraccionDTO;
import pe.edu.upc.aaw.demo01.entities.Configuracion;
import pe.edu.upc.aaw.demo01.entities.Interaccion;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IInteraccionService;

@RestController
@RequestMapping("/interaccion")
public class InteraccionController {

    @Autowired
    private IInteraccionService intR;

    @PostMapping
    public void registrar(@RequestBody InteraccionDTO dto){
        ModelMapper m=new ModelMapper();
        Interaccion con=m.map(dto, Interaccion.class);
        intR.insert(con);
    }
}
