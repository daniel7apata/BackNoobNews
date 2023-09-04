package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Publicacion;
import pe.edu.upc.aaw.demo01.entities.PublicacionExterna;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.util.List;

public interface IPublicacionService {

    public void insert(Publicacion publicacion);

    public List<Publicacion> list();
    public void delete (int idNews);
    List<Publicacion> findByIdUser(Usuario news);
}
