package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Publication;

import java.util.List;


public interface IPublicationService {

    public void insert(Publication publication);
    public List<Publication> list();
    public void delete(int idPublication);
    public Publication listId(int idPublication);

    List<String[]> getCountInteractionsByPublication();
}
