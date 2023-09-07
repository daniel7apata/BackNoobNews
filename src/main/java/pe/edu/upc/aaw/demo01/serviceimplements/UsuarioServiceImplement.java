package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuS;

    @Override
    public void insert(Usuario usuario) {
        {
            usuS.save(usuario);
        }
    }

    @Override
    public List<Usuario> list()
    {
        return usuS.findAll();
    }

    @Override
    public void delete(int idUser) {
        usuS.deleteById(idUser);
    }

    @Override
    public List<Usuario> findByIdUser(Usuario usuario) {
        return null;
    }
}
