package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Category;

import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "SELECT c.name_category, COUNT(p.id_publication) \n" +
            "FROM category c inner join publication p  \n" +
            "ON c.id_category = p.id_publication \n" +
            "GROUP BY c.name_category  \n" +
            "order BY COUNT(p.id_publication) DESC", nativeQuery = true)
    List<String[]> PublicationCategory();
}
