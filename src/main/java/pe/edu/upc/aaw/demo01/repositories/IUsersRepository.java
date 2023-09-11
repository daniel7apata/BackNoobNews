package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users,Integer> {
  
@Query(value = "SELECT us.name_user, COUNT(inte.id_interaction) " +
            "FROM Users us inner join Interaction inte " +
            "ON us.id_user = inte.id_user " +
            "GROUP BY us.name_user " +
            "order BY COUNT(inte.id_interaction) " +
            "DESC", nativeQuery = true)
    List<String[]> InteractionUsers();
}
