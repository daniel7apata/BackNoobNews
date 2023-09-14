package pe.edu.upc.aaw.demo01.servicesinterfaces;
import pe.edu.upc.aaw.demo01.entities.Interaction;


import java.util.List;


public interface IInteractionService {

    public void insert(Interaction interaction);
    public List<Interaction> list();
    public void delete(int idInteraction);
    public Interaction listId(int idInteraction);
}
