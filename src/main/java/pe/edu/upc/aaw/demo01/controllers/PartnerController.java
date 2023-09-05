package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.ClubDTO;
import pe.edu.upc.aaw.demo01.dtos.PartnerDto;
import pe.edu.upc.aaw.demo01.entities.Partner;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPartnerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    @Autowired
    private IPartnerService pS;

    @PostMapping
    public void registrar (@RequestBody PartnerDto dto){
    ModelMapper m=new ModelMapper();
    Partner p=m.map(dto,Partner.class);
    pS.insert(p);
}
    @GetMapping
    public List<PartnerDto> listar(){
    return pS.list().stream().map(x->{
        ModelMapper m=new ModelMapper();
        return m.map(x,PartnerDto.class);
    }).collect(Collectors.toList());
}

}
