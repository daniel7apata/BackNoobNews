package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.TipoUsuario;
import pe.edu.upc.aaw.demo01.repositories.ITipoUsuarioRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.ITipoUsuarioService;

@Service
public class TipoUsuarioImplement implements ITipoUsuarioService {
    @Autowired
    private ITipoUsuarioRepository tipuR;
    @Override
    public void insert(TipoUsuario tipoUsuario) {
        tipuR.save(tipoUsuario);
    }

    @Override
    public void delete(int idUserType) {
        tipuR.deleteById(idUserType);
    }

    @Override
    public TipoUsuario listId(int idUserType) {
        return tipuR.findById(idUserType).orElse(new TipoUsuario());
    }
}
