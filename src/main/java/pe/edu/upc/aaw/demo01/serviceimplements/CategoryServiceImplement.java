package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Category;

import pe.edu.upc.aaw.demo01.repositories.ICategoryRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImplement implements ICategoryService {

    @Autowired
    private ICategoryRepository catS;

    @Override
    public void insert(Category category) {
        catS.save(category);
    }

    @Override
    public void delete(int idCategory) {
        catS.deleteById(idCategory);
    }

    @Override
    public List<Category> list() {
        return catS.findAll();
    }

    @Override
    public Category listId(int idCategory) {
        return catS.findById(idCategory).orElse(new Category());}

    @Override
    public List<String[]> getCountPublicationByCategory() {
        return catS.PublicationCategory();
    }
}
