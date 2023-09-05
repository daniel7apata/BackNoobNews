package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Interaccion;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IInterfaceRepository extends JpaRepository<Interaccion,Integer> {


}
