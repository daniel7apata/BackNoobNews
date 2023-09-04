package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Club;
import pe.edu.upc.aaw.demo01.entities.Reconocimiento;
import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.repositories.IReconocimientoRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IReconocimientoService;

import java.util.List;

@Service
public class ReconociemientoServiceImplement implements IReconocimientoService {

    @Autowired
    private IReconocimientoRepository recR;

    @Override
    public void insert(Reconocimiento reconocimiento) {
        recR.save(reconocimiento);
    }

    @Override
    public Reconocimiento listid(int idAcknowledgment) {
        return recR.findById(idAcknowledgment).orElse(new Reconocimiento());
    }

    @Override
    public List<Reconocimiento> findByUser(Usuario user) {
        return null;
    }
}
