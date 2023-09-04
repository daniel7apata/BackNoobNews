package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Configuracion;
import pe.edu.upc.aaw.demo01.repositories.IConfiguracionRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IConfiguracionService;

@Service
public class ConfiguracionServiceImplement implements IConfiguracionService {

    @Autowired
    private IConfiguracionRepository conS;

    @Override
    public void insert(Configuracion configuracion) {
    conS.save(configuracion);
    }
}
