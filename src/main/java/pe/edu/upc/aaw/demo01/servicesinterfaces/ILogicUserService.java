package pe.edu.upc.aaw.demo01.servicesinterfaces;



import pe.edu.upc.aaw.demo01.entities.LogicUser;

import java.util.List;

public interface ILogicUserService {

    public void insert(LogicUser logicUser);
    public List<LogicUser> list();
    public void delete(Long idLogicUser);
    public LogicUser listarId(Long idLogicUser);

    List<String[]> getCountInteractionByUsers();
}
