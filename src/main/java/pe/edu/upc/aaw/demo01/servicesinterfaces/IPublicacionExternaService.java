package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.PublicacionExterna;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.util.List;

public interface IPublicacionExternaService {

    public void insert(PublicacionExterna publicacionExterna);

    List<PublicacionExterna> findByIdUser(Usuario user);
}
