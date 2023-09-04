package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.PublicacionExterna;
import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.repositories.PublicacionExternaRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPublicacionExternaService;

import java.util.List;

@Service
public class PublicacionExternaImplement implements IPublicacionExternaService {

    @Autowired
    private PublicacionExternaRepository pubextR;
    @Override
    public void insert(PublicacionExterna publicacionExterna) {
    pubextR.save(publicacionExterna);
    }

    @Override
    public List<PublicacionExterna> findByIdUser(Usuario user) {
        return null;
    }
}
