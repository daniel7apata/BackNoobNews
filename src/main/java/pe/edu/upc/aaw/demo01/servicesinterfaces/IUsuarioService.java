package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.util.List;

public interface IUsuarioService {


    public void insert(Usuario usuario);

    public List<Usuario> list();
    public void delete (int idUser);
    List<Usuario> findByIdUser(Usuario usuario);

}
