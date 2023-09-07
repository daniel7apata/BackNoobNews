package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Reconocimiento;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.util.List;

public interface IReconocimientoService {

    public void insert (Reconocimiento reconocimiento);

    public Reconocimiento listid(int idAcknowledgment);

    List<Reconocimiento> findByUser(Usuario user);
}
