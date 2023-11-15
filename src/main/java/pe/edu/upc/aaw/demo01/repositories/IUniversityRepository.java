package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.University;

import java.util.List;

@Repository
public interface IUniversityRepository extends JpaRepository<University,Integer> {

  @Query(value = "SELECT un.name_university, COUNT(logus.id) FROM university un \n" +
          "inner join logic_user logus  ON un.id_university = logus.id_university \n" +
          "GROUP BY un.name_university  \n" +
          "order BY COUNT(logus.id)  \n" +
          "DESC", nativeQuery = true)
  List<String[]> UserUniversity();
  
}
