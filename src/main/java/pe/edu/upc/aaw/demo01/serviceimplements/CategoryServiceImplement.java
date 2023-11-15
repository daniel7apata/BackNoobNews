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
    private ICategoryRepository catR;

    @Override
    public void insert(Category category) {
        catR.save(category);
    }

    @Override
    public void delete(int idCategory) {
        catR.deleteById(idCategory);
    }

    @Override
    public List<Category> list() {
        return catR.findAll();
    }

    @Override
    public Category listId(int idCategory) {
        return catR.findById(idCategory).orElse(new Category());}

    @Override
    public List<String[]> getCountPublicationByCategory() {
        return catR.PublicationCategory();
    }
}
