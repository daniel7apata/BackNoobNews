package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.LogicRol;

import java.util.List;

public interface ILogicRolService {
    public void insert(LogicRol logicRol);
    public List<LogicRol> list();
    public void delete(Long idLogicRol);
    public LogicRol listarId(Long idLogicRol);

    List<String[]> getCountUserByRole();
}
