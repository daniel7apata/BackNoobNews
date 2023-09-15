package pe.edu.upc.aaw.demo01.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.demo01.entities.Users;
import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users,Integer> {
  
@Query(value = "SELECT us.name_user, COUNT(inte.id_interaction) " +
            "FROM Users us inner join Interaction inte " +
            "ON us.id_user = inte.id_user " +
            "GROUP BY us.name_user " +
            "order BY COUNT(inte.id_interaction) " +
            "DESC", nativeQuery = true)
    List<String[]> InteractionUsers();



//security
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, id_user) VALUES (:rol, :id_user)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("id_user") int user_id);


}
