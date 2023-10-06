package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.service;

import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.repository.SucursalRepo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SucursalService {

    @Autowired
    private SucursalRepo sucursalRepo;

    public int saveSucursal(Sucursal sucursal) {
        int res=0;
        Sucursal sucursal1=sucursalRepo.save(sucursal);
        if(!sucursal1.equals(null)){
            res=1;
        }
        return res;
    }

    public Sucursal updateSucursal(Sucursal sucursal) {
        return sucursalRepo.save(sucursal);
    }

    public List<Sucursal> getAll() {
        return (List<Sucursal>) sucursalRepo.findAll();
    }

    public void delete(Long id) {
        sucursalRepo.deleteById(id);
    }

    public Sucursal getPk_SucursalID(Long id) {
        Optional<Sucursal> sucursalData = sucursalRepo.findById(id);
        if (sucursalData.isPresent()) {
            return sucursalData.get();
        } else {
            return new Sucursal();
        }
    }
}

