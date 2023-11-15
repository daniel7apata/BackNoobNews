package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.LogicRol;
import pe.edu.upc.aaw.demo01.repositories.ILogicRolRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ILogicRolService;


import java.util.List;

@Service
public class LogicRolServiceImplement implements ILogicRolService {

    @Autowired
    private ILogicRolRepository LRr;

    @Override
    public void insert(LogicRol logicRol) {
        LRr.save(logicRol);
    }

    @Override
    public List<LogicRol> list() {
        return LRr.findAll();
    }

    @Override
    public void delete(Long idLogicRol) {
        LRr.deleteById(idLogicRol);
    }

    @Override
    public LogicRol listarId(Long idLogicRol) {
        return LRr.findById(idLogicRol).orElse(new LogicRol());
    }

    public List<String[]> getCountUserByRole() {return LRr.UserRole();}
}
