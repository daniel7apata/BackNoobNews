package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.UsuarioDTO;
import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuS;

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario c=m.map(dto,Usuario.class);
        usuS.insert(c);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return usuS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        usuS.delete(id);
    }
}
