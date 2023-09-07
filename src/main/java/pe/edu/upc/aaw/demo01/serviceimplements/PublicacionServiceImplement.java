package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Publicacion;

import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.repositories.IPublicacionRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPublicacionService;

import java.util.List;

@Service
public class PublicacionServiceImplement implements IPublicacionService {

    @Autowired
    private IPublicacionRepository pubS;


    @Override
    public void insert(Publicacion publicacion) {
        pubS.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pubS.findAll();
    }

    @Override
    public void delete(int idNews) {
        pubS.deleteById(idNews);

    }

    @Override
    public List<Publicacion> findByIdUser(Usuario news) {
        return null;
    }
}
