package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Configuration;

import pe.edu.upc.aaw.demo01.repositories.IConfigurationRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IConfigurationService;

import java.util.List;

@Service
public class ConfigurationServiceImplement implements IConfigurationService {

    @Autowired
    private IConfigurationRepository conS;


    @Override
    public void insert(Configuration configuration) {
        conS.save(configuration);
    }

    @Override
    public void delete(int idConfiguration) {
        conS.deleteById(idConfiguration);
    }

    @Override
    public List<Configuration> list() {
        return conS.findAll();
    }

    @Override
    public Configuration listId(int idConfiguration) {
        return conS.findById(idConfiguration).orElse(new Configuration());
    }
}
