package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.CategoryDTO;
import pe.edu.upc.aaw.demo01.dtos.ConfigurationDTO;
import pe.edu.upc.aaw.demo01.dtos.PublicationCategoryDTO;
import pe.edu.upc.aaw.demo01.dtos.UserUniversityDTO;
import pe.edu.upc.aaw.demo01.entities.Category;
import pe.edu.upc.aaw.demo01.entities.Configuration;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ICategoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService catS;

    @PostMapping
    public void registrar(@RequestBody CategoryDTO dto){
        ModelMapper m=new ModelMapper();
        Category t=m.map(dto, Category.class);
        catS.insert(t);
    }


    @GetMapping
    public List<CategoryDTO> listar(){
        return catS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CategoryDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        catS.delete(id);
    }


    @GetMapping("/{id}")
    public CategoryDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CategoryDTO dto=m.map(catS.listId(id), CategoryDTO.class);
        return dto;
    }


    @GetMapping("/publication")
    public List<PublicationCategoryDTO> getPublicationbyCategory() {
        List<String[]> countPublicationByCategory = catS.getCountPublicationByCategory();
        List<PublicationCategoryDTO> publicationCategoryDTOList = new ArrayList<>();

        for (String[] data : countPublicationByCategory) {
            if (data.length >= 2) {
                PublicationCategoryDTO publicationCategoryDTO = new PublicationCategoryDTO();
                publicationCategoryDTO.setNameCategory(data[0]);
                publicationCategoryDTO.setQuantityPublication(Integer.parseInt(data[1]));
                publicationCategoryDTOList.add(publicationCategoryDTO);
            }
        }

        return publicationCategoryDTOList;
    }
}
