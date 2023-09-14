package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Role;

import java.util.List;


public interface IRoleService {
    public void insert(Role role);
    public List<Role> list();
    public void delete(int idRole);
    public Role listId(int idRole);

    List<String[]> getCountUserByRole();
}
