package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Publication;


import pe.edu.upc.aaw.demo01.repositories.IPublicationRepository;

import pe.edu.upc.aaw.demo01.servicesinterfaces.IPublicationService;

import java.util.List;


@Service
public class PublicationServiceImplement implements IPublicationService {

    @Autowired
    private IPublicationRepository pU;

    @Override
    public void insert(Publication publication) {
        pU.save(publication);
    }

    @Override
    public void delete(int idPublication) {
        pU.deleteById(idPublication);
    }

    @Override
    public List<Publication> list() {
        return pU.findAll();
    }

    @Override
    public Publication listId(int idPublication) {
        return pU.findById(idPublication).orElse(new Publication());
    }

    @Override
    public List<String[]> getCountInteractionsByPublication() {
        return pU.InteractionPublication();
    }
}
