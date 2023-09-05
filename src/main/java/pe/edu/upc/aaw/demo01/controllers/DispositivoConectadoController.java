package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demo01.dtos.CategoriaDTO;
import pe.edu.upc.aaw.demo01.dtos.DispositivoConectadoDTO;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IDispositivoConectadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivoconectado")
public class DispositivoConectadoController {

    @Autowired
    private IDispositivoConectadoService disconR;

    @GetMapping
    public List<DispositivoConectadoDTO> listar(){
        return disconR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, DispositivoConectadoDTO.class);
        }).collect(Collectors.toList());
    }
}
