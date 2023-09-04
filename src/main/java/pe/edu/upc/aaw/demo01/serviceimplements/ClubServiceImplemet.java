package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Club;
import pe.edu.upc.aaw.demo01.repositories.IClubRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IClubService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClubServiceImplemet implements IClubService {
    @Autowired
    private IClubRepository cR;

    @Override
    public void insert(Club club) {
        cR.save(club);
    }

    @Override
    public List<Club> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idClub) {
        cR.deleteById(idClub);
    }

    @Override
    public Club listId(int idClub) {
        return cR.findById(idClub).orElse(new Club());
    }

    @Override
    public List<Club> findByCreationDateClub(LocalDate creationDateClub) {
        return cR.findByCreationDateClub(creationDateClub);
    }


}
