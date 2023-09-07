package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Universidad;

import java.util.List;

public interface IUniversidadService {

    public void insert(Universidad universidad);

    List<Universidad> findByName (String name);
}
