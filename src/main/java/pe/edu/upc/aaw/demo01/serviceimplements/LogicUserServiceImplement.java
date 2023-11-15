package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.LogicUser;
import pe.edu.upc.aaw.demo01.repositories.ILogicUserRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ILogicUserService;

import java.util.List;

@Service
public class LogicUserServiceImplement implements ILogicUserService {

    @Autowired
    private ILogicUserRepository LUr;

    @Override
    public void insert(LogicUser logicUser) {
        LUr.save(logicUser);
    }

    @Override
    public List<LogicUser> list() {
        return LUr.findAll();
    }

    @Override
    public void delete(Long idLogicUser) {
        LUr.deleteById(idLogicUser);
    }

    @Override
    public LogicUser listarId(Long idLogicUser) {
        return LUr.findById(idLogicUser).orElse(new LogicUser());
    }

    @Override
    public List<String[]> getCountInteractionByUsers() {
        return LUr.InteractionUsers();
    }
}
