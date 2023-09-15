package pe.edu.upc.aaw.demo01.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Users;
import pe.edu.upc.aaw.demo01.repositories.IUserRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUsersService;
import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {

    @Autowired
    private IUserRepository usS;

    @Override
    public void insert(Users user) {
        usS.save(user);
    }

    @Override
    public void delete(int idRole) {
        usS.deleteById(idRole);
    }

    @Override
    public List<Users> list() {
        return usS.findAll();
    }

    @Override
    public Users listId(int idUser) {
        return usS.findById(idUser).orElse(new Users());
    }
    @Override
    public List<String[]> getCountInteractionByUsers() {
        return usS.InteractionUsers();
    }

}
