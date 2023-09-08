package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.University;

import java.util.List;

public interface IUniversityService {

    public void insert(University university);

    public List<University>list();

    public University listId (int idUnivesity);
}
