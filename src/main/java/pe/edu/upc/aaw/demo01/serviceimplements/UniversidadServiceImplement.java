package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Universidad;
import pe.edu.upc.aaw.demo01.repositories.IUniversidadRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUniversidadService;

import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService {

    @Autowired
    private IUniversidadRepository uniS;

    @Override
    public void insert(Universidad universidad) {
        {
            uniS.save(universidad);
        }
    }

    @Override
    public List<Universidad> findByName(String name) {
        return null;
    }
}
