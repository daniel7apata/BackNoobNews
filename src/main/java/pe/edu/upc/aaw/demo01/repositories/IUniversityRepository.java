package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.University;

@Repository
public interface IUniversityRepository extends JpaRepository<University,Integer> {

  @Query(value = "SELECT un.name_university, COUNT(us.id_user) FROM university un inner join users us  ON un.id_university = us.id_university GROUP BY un.name_university  order BY COUNT(us.id_user)  DESC", nativeQuery = true)
  List<String[]> UserUniversity();
  
}
