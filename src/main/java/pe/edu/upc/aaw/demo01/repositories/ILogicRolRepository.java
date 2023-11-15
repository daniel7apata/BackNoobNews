package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.LogicRol;

import java.util.List;


@Repository
public interface ILogicRolRepository extends JpaRepository<LogicRol,Long> {
    @Query(value = "SELECT LOGIC_ROL.ROL, COUNT(LOGIC_ROL.ROL) FROM LOGIC_ROL \n" +
            "INNER JOIN LOGIC_USER ON LOGIC_USER.ID = LOGIC_ROL.ID_LOGICUSER\n" +
            "GROUP BY LOGIC_ROL.ROL\n" +
            "ORDER BY COUNT(LOGIC_ROL.ROL)\n" +
            "DESC\n", nativeQuery = true)
    List<String[]> UserRole();
}

