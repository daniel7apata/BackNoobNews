package pe.edu.upc.aaw.demo01.servicesinterfaces;
import pe.edu.upc.aaw.demo01.entities.Users;
import java.util.List;


public interface IUsersService {

    public void insert(Users user);
    public List<Users> list();
    public void delete(int idUser);
    public Users listId(int idUser);

    List<String[]> getCountInteractionByUsers();


}
