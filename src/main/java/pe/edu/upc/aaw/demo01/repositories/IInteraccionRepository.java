package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Interaccion;

@Repository
public interface IInteraccionRepository extends JpaRepository<Interaccion,Integer> {


}
