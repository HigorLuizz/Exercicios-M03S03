package br.com.devinhouse.mypets.services;

import br.com.devinhouse.mypets.models.UsuarioModel;
import br.com.devinhouse.mypets.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements UserDetailsService {
    private UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioModel> getAll(){
        return usuarioRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioModel user = this.usuarioRepository.findUserByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        return new User(user.getUsername(),user.getPassword(), user.getAuthorities());
    }
}
