package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Acknowledgment;

import java.util.List;

public interface IAcknowledgmentService {


    public void insert(Acknowledgment acknowledgment);
    public List<Acknowledgment> list();
    public void delete(int idAcknowledgment);
    public Acknowledgment listId(int idAcknowledgment);
}
