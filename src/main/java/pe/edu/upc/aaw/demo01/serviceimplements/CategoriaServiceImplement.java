package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Categoria;
import pe.edu.upc.aaw.demo01.repositories.ICategoriaRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {

    @Autowired
    private ICategoriaRepository catR;
    @Override
    public void insert(Categoria categoria) {
        catR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return catR.findAll();
    }
}
