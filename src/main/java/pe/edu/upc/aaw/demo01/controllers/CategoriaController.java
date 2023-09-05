package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.CategoriaDTO;
import pe.edu.upc.aaw.demo01.dtos.PartnerDto;
import pe.edu.upc.aaw.demo01.entities.Categoria;
import pe.edu.upc.aaw.demo01.entities.Partner;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaService catR;

    @PostMapping
    public void registrar(@RequestBody CategoriaDTO dto){
        ModelMapper m=new ModelMapper();
        Categoria ca=m.map(dto,Categoria.class);
        catR.insert(ca);
    }

    @GetMapping
    public List<CategoriaDTO> listar(){
        return catR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

}
