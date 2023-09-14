package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Publication;

import java.util.List;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Integer> {


    @Query(value = "SELECT publi.id_publication, publi.headline, COUNT(inte.id_publication)\n" +
            "    FROM Interaction inte INNER JOIN Publication publi  ON inte.id_publication = publi.id_publication\n" +
            "    GROUP BY publi.id_publication  ORDER BY COUNT(publi.id_publication)  DESC", nativeQuery = true)
    List<String[]> InteractionPublication();

}
