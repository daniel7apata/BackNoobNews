package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.LogicUser;

import java.util.List;


@Repository
public interface ILogicUserRepository extends JpaRepository<LogicUser,Long> {

    @Query(value = "SELECT lous.name_user, COUNT(inte.id_interaction)\n" +
            "            FROM logic_user lous inner join Interaction inte\n" +
            "            ON lous.id = inte.id_logicuser\n" +
            "            GROUP BY lous.name_user \n" +
            "            order BY COUNT(inte.id_interaction)\n" +
            "            DESC", nativeQuery = true)
    List<String[]> InteractionUsers();
}
