package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Categoria;

import java.util.List;

public interface ICategoriaService {

    public void insert(Categoria categoria);
    public List<Categoria> list();

}
