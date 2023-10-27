package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.service;

import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Dado;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Usuario;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.repository.UsuarioRepo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;

    public int saveUsuario(Usuario usuario) {
        int res=0;
        Usuario usuario1= usuarioRepo.save(usuario);
        if(!usuario1.equals(null)){
            res=1;
        }
        return res;
    }

    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> getAll() {
        return (List<Usuario>) usuarioRepo.findAll();
    }

    public void delete(Long id) {
        usuarioRepo.deleteById(id);
    }

    public Usuario getUsuarioID(Long id) {
        Optional<Usuario> usuarioData = usuarioRepo.findById(id);
        if (usuarioData.isPresent()) {
            return usuarioData.get();
        } else {
            return new Usuario();
        }
    }

    public static int lanzarD(){

        return (int)(Math.random() * 6) + 1;
    }

}

