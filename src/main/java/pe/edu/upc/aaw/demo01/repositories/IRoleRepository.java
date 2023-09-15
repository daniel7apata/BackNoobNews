package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Role;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

    @Query(value = "Select r.description, COUNT (us.id_user) FROM role r inner join users us On r.id_role = us.id_role GROUP BY r.description order by count (us.id_user) desc", nativeQuery = true)
    List<String[]> UserRole();
}
