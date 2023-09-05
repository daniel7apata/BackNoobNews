package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demo01.dtos.ConfiguracionDTO;
import pe.edu.upc.aaw.demo01.entities.Categoria;
import pe.edu.upc.aaw.demo01.entities.Configuracion;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IConfiguracionService;

@RestController
@RequestMapping("/configuracion")
public class ConfiguracionController {

    @Autowired
    private IConfiguracionService conS;

    @PostMapping
    public void registrar(@RequestBody ConfiguracionDTO dto){
    ModelMapper m=new ModelMapper();
    Configuracion con=m.map(dto, Configuracion.class);
        conS.insert(con);
}
}
