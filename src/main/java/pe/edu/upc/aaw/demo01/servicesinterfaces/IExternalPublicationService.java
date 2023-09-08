package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.ExternalPublication;


import java.util.List;


public interface IExternalPublicationService {

    public void insert(ExternalPublication externalPublication);
    public List<ExternalPublication> list();
    public void delete(int idExternalPublication);
    public ExternalPublication listId(int idExternalPublication);
}
