package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Configuracion;

@Repository
public interface IConfiguracionRepository extends JpaRepository<Configuracion,Integer> {
}
