package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Configuration;

import java.util.List;

public interface IConfigurationService {

    public void insert(Configuration configuration);
    public List<Configuration> list();
    public void delete(int idConfiguration);
    public Configuration listId(int idConfiguration);
}
