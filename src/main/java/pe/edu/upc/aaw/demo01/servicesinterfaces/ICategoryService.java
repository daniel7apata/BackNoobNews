package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Category;


import java.util.List;

public interface ICategoryService {

    public void insert(Category category);
    public List<Category> list();
    public void delete(int idCategory);
    public Category listId(int idCategory);
}
