package pe.edu.upc.aaw.demo01.servicesinterfaces;
import pe.edu.upc.aaw.demo01.entities.Interaccion;
import pe.edu.upc.aaw.demo01.entities.Publicacion;

import java.util.List;

public interface IInteraccionService {
    public void insert(Interaccion interaccion);
    List<Interaccion> findByIdNews(Publicacion news);
}
