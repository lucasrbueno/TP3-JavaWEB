package br.edu.infnet.SpringMVCPU.model.service;

import br.edu.infnet.SpringMVCPU.model.negocio.Login;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.SpringMVCPU.model.negocio.Usuario;
import br.edu.infnet.SpringMVCPU.model.repository.IUsuarioRepository;
import java.util.ArrayList;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    
    Usuario usuario = new Usuario();
    Login login = new Login();
    List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario)
    {
        usuarioRepository.save(usuario);
        this.usuario = usuario;
    }

    public Usuario consultar()
    {
        return usuario;
    }

    public Usuario consultarPorID(Integer id)
    {
        return usuarioRepository.findById(id).get();
    }

    public boolean compararEmail() {
        usuarios = (List<Usuario>) usuarioRepository.findAll();

        for(Usuario us: usuarios) {
            if(login.getEmail().equalsIgnoreCase(us.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public boolean compararSenha() {
        usuarios = (List<Usuario>) usuarioRepository.findAll();

        for(Usuario usuario: usuarios) {
            if(login.getSenha().equalsIgnoreCase(usuario.getSenha())) {
                return true;
            }
        }
        return false;
    }

    public void salvarLogin(Login login)
    {
        this.login = login;
    }
}