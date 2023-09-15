package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Role;
import pe.edu.upc.aaw.demo01.repositories.IRoleRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IRoleService;

import java.util.List;


@Service
public class RoleServiceImplement implements IRoleService {

    @Autowired
    private IRoleRepository rU;

    @Override
    public void insert(Role role) {
        rU.save(role);
    }

    @Override
    public void delete(int idRole) {
        rU.deleteById(idRole);
    }

    @Override
    public List<Role> list() {
        return rU.findAll();
    }

    @Override
    public Role listId(int idRole) {
        return rU.findById(idRole).orElse(new Role());
    }

    @Override
    public List<String[]> getCountUserByRole() {return rU.UserRole();}


}
