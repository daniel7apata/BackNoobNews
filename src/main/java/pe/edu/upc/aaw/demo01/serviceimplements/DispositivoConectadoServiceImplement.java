package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.DispositivoConectado;
import pe.edu.upc.aaw.demo01.repositories.IDispositivoConectadoRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IDispositivoConectadoService;

import java.util.List;

@Service
public class DispositivoConectadoServiceImplement implements IDispositivoConectadoService {

    @Autowired
    private IDispositivoConectadoRepository disconS;

    @Override
    public List<DispositivoConectado> list() {return disconS.findAll();}
}
