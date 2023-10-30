package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.controller;

import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Dado;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Tirada;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Usuario;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.service.UsuarioService;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;



@Controller
public class HomeController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String index(Model model){
        List<Usuario>usuarios= usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);
        return "home";
    }

    @GetMapping("/agregar")
    public String agregar(Model model){
        model.addAttribute("usuario", new Usuario());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Validated Usuario s, Model model){
        usuarioService.saveUsuario(s);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable long id, Model model){

        Optional<Usuario>usuario= Optional.ofNullable(usuarioService.getUsuarioID(id));
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Model model, @PathVariable long id){
        usuarioService.delete(id);;
        return "redirect:/";

    }

    @GetMapping("/usuario/getAll")
    public List<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @PutMapping("/usuario/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

    @GetMapping("/usuario/getOne/{id}")
    public Usuario getOne(@PathVariable Long id) {
        return usuarioService.getUsuarioID(id);
    }

    @DeleteMapping("/usuario/delete/{id}")
    public void delete(@RequestBody Long id){
        usuarioService.delete(id);
    }

    @GetMapping("/nuevaTirada")
    public String nuevaTirada(Model model){
        model.addAttribute("usuario", new Usuario());
        List<Usuario>usuarios= usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);

        return "form1";
    }

    @GetMapping("/jugar/{id}")
    public String jugar(Model model, @PathVariable Long id){
        int dado1 = usuarioService.lanzarD();
        int dado2 = usuarioService.lanzarD();
        if (dado1 + dado2 == 7){
            Usuario usuario = usuarioService.getUsuarioID(id);
            usuario.setJuegosGanados(usuario.getJuegosGanados() + 1);
        } else {
            Usuario usuario = usuarioService.getUsuarioID(id);
            int perdidos = 0;
            //perdidos = usuario.getJuegosPerdidos();
            //usuario.setJuegosPerdidos(perdidos + 1);
        }
        model.addAttribute("usuarios", usuarioService.getAll());
        return "form1";
    }



}

