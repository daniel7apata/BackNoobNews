package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.University;
import pe.edu.upc.aaw.demo01.repositories.IUniversityRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUniversityService;

import java.util.List;


@Service
public class UniversityServiceImplement implements IUniversityService {

    @Autowired
    private IUniversityRepository uS;

    @Override
    public void insert(University university) {
        uS.save(university);
    }

    @Override
    public List<University> list() {
        return uS.findAll();
    }

    @Override
    public University listId(int idUnivesity) {
        return uS.findById(idUnivesity).orElse(new University());
    }
}
