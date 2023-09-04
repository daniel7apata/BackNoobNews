package pe.edu.upc.aaw.demo01.servicesinterfaces;


import pe.edu.upc.aaw.demo01.entities.TipoUsuario;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

public interface IUsuarioService {

    public void insert (Usuario usuario);
    public List<Usuario> list();
    public void delete(int idUser);
    public Usuario listId(int idUser);
    List<Usuario> findByIdUserType(TipoUsuario userType);
    List<Usuario> findByName(String name);
}
