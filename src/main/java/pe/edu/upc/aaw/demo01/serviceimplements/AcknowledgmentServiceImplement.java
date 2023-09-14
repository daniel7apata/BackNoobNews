package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.aaw.demo01.entities.Acknowledgment;

import pe.edu.upc.aaw.demo01.repositories.IAcknowledgmentRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IAcknowledgmentService;

import java.util.List;
import java.util.Optional;

@Service
public class AcknowledgmentServiceImplement implements IAcknowledgmentService {

    @Autowired
    private IAcknowledgmentRepository acK;


    @Override
    public void insert(Acknowledgment acknowledgment) {
        acK.save(acknowledgment);
    }

    @Override
    public void delete(int idAcknowledgment) {
        acK.deleteById(idAcknowledgment);
    }

    @Override
    public List<Acknowledgment> list() {
        return acK.findAll();
    }

    @Override
    public Acknowledgment listId(int idAcknowledgment) {
        return acK.findById(idAcknowledgment).orElse(new Acknowledgment());}


}
