package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Interaction;

import pe.edu.upc.aaw.demo01.repositories.IInteractionRepository;

import pe.edu.upc.aaw.demo01.servicesinterfaces.IInteractionService;

import java.util.List;


@Service
public class InteractionServiceImplement implements IInteractionService {

    @Autowired
    private IInteractionRepository iR;

    @Override
    public void insert(Interaction interaction) {
        iR.save(interaction);
    }

    @Override
    public void delete(int idInteraction) {
        iR.deleteById(idInteraction);
    }

    @Override
    public List<Interaction> list() {
        return iR.findAll();
    }

    @Override
    public Interaction listId(int idInteraction) {
        return iR.findById(idInteraction).orElse(new Interaction());
    }
}
