package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.TipoUsuario;
import pe.edu.upc.aaw.demo01.entities.Usuario;
import pe.edu.upc.aaw.demo01.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImplement implements IUsuarioService {

    IUsuarioRepository U;

    @Override
    public void insert(Usuario usuario) {
        U.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return U.findAll();
    }

    @Override
    public void delete(int idUser) {

    }
    @Override
    public List<Usuario> findByIdUser(Usuario usuario) {
        return null;
    }


    //Clase 2
    @Service
    public class JwtUserDetailsService implements UserDetailsService {
        @Autowired
        private IUsuarioRepository repo;

        /*@Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            //Aqui lógica para buscar el usuario en BD
            //Usuario defecto web:password

            if ("web".equals(username)) {
                return new User("web", "$2a$12$CTtjF8P3IJVK6pP4w9pTxuldMqQRrfrLbLLIlasdu2K6ii2vWGly2",
                        new ArrayList<>());
            } else {
                throw new UsernameNotFoundException("Usuario no encontrado: " + username);
            }
        }*/
        @Override
        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            Usuario user = repo.findByEmail(email);

            if(user == null) {
                throw new UsernameNotFoundException(String.format("User not exists", email));
            }

            List<TipoUsuario> roles = new ArrayList<>();

            user.getUserType().forEach(rol -> {
                roles.add(new SimpleGrantedAuthority(rol.getRol()));
            });

            UserDetails ud = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getEnabled(), true, true, true, roles);

            return ud;
        }
    }

}
