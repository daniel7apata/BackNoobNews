package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
