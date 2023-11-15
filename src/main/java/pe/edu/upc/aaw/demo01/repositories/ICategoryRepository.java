package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Category;

import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "select category.name_category, count(*)  from category\n" +
            "inner join publication on publication.id_category=category.id_category\n" +
            "group by category.name_category\n" +
            "order by count(category.name_category)\n" +
            "desc", nativeQuery = true)
    List<String[]> PublicationCategory();
}
