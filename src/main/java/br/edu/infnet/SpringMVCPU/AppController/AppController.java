package br.edu.infnet.SpringMVCPU.AppController;

import br.edu.infnet.SpringMVCPU.model.negocio.Login;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import br.edu.infnet.SpringMVCPU.model.negocio.Usuario;
import br.edu.infnet.SpringMVCPU.model.service.UsuarioService;

@Controller
public class AppController {
	
    @Autowired
    private UsuarioService usuarioService;
    
    @RequestMapping("/index")
    public String index(Model model) 
    {
        Login login = new Login();
    	model.addAttribute("login", login);
        return "/";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(Model model) 
    {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "cadastro";
    }
    
    @RequestMapping("/cadastrar")
    public String cadastrar(Model model, Usuario usuario) throws SQLException {
    	usuarioService.salvar(usuario);
        return "redirect:/usuariologado";
    }
    
    @RequestMapping("/usuariologado")
    public String consulta(Model model) {
    	model.addAttribute("usuario", usuarioService.consultar());
        return "usuariologado";
    }
    
     @RequestMapping(value = "/validacao")
    public String validacao(Model model, Login login)throws SQLException {
    	usuarioService.salvarLogin(login);
    	return "redirect:/validacaologin";
    }
    
    @RequestMapping(value = "/validacaologin")
    public String validacaologin(Model model) {
    	String mensagem;
        
    	if(usuarioService.compararEmail()==true) {
            if(usuarioService.compararSenha()==true) {
                mensagem = "Você está autenticado no sistema.";
            } else {
                mensagem = "Dados incorretos.";
            }
    	} else {
    		mensagem = "Nenhum e-mail cadastrado com esse endereço no sistema.";
    	}
    	model.addAttribute("mensagem", mensagem);
        return "validacaologin";
    }  
}