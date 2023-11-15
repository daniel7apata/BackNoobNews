package pe.edu.upc.aaw.demo01.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Publication;
import java.util.List;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Integer> {

    @Query(value = "SELECT us.headline, COUNT(inte.id_interaction) " +
            "FROM Publication us inner join Interaction inte " +
            "ON us.id_publication = inte.id_publication " +
            "GROUP BY us.headline " +
            "order BY COUNT(inte.id_interaction) " +
            "DESC", nativeQuery = true)
    List<String[]> InteractionPublication();

}
