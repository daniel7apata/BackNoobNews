package pe.edu.upc.aaw.demo01.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.ExternalPublication;
import pe.edu.upc.aaw.demo01.repositories.IExternalPublicationRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IExternalPublicationService;
import java.util.List;


@Service
public class ExternalPublicationServiceImplement implements IExternalPublicationService {

    @Autowired
    private IExternalPublicationRepository extP;


    @Override
    public void insert(ExternalPublication externalPublication) {
        extP.save(externalPublication);
    }

    @Override
    public void delete(int idExternalPublication) {
        extP.deleteById(idExternalPublication);
    }

    @Override
    public List<ExternalPublication> list() {
        return extP.findAll();
    }

    @Override
    public ExternalPublication listId(int idExternalPublication) {
        return extP.findById(idExternalPublication).orElse(new ExternalPublication());
    }
}
