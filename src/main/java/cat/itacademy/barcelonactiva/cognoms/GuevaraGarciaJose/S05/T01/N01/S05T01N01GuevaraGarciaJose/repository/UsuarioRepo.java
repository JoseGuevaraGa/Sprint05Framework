package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.repository;

import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends CrudRepository<Usuario, Long> {
}
