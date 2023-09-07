package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.TipoUsuarioDTO;
import pe.edu.upc.aaw.demo01.entities.TipoUsuario;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ITipoUsuarioService;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService tipoS;
    @PostMapping
    public void registrar(@RequestBody TipoUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoUsuario t=m.map(dto, TipoUsuario.class);
        tipoS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tipoS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoUsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TipoUsuarioDTO dto=m.map(tipoS.listId(id),TipoUsuarioDTO.class);
        return dto;
    }

}
