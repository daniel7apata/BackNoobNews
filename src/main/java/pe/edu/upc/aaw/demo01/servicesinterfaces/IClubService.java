package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.dtos.ClubDTO;
import pe.edu.upc.aaw.demo01.entities.Club;

import java.time.LocalDate;
import java.util.List;
public interface IClubService {
    public void insert(Club club);
    public List<Club> list();
    public void delete(int idClub);
    public Club listId(int idClub);

    List<Club> findByCreationDateClub(LocalDate creationDateClub);
}
