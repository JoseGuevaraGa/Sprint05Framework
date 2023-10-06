package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model;

import jakarta.persistence.Column;

import java.util.Arrays;
import java.util.List;

public class SucursalDTO extends Sucursal {
    @Column(name = "tipusSucursal")
    private String tipusSucursal;
    List<String> paisesUnion = Arrays.asList("Alemania","Austria", "Bélgica", "Chipre", "República Checa", "Croacia", "Dinamarca", "Chipre", "Eslovaquia", "España"
            ,"Estonia", "Finlandia", "Francia", "Grecia","Estonia", "Finlandia","Irlanda", "Italia", "Letonia", "Lituania", "Luxemburgo", "Malta", "Países Bajos", "Polonia", "Portugal", "Rumanía", "Suecia");

    public String buscarPais() {
        String paisUE;
        if(paisesUnion.contains("España")){
          paisUE = ("UE");
        }else{
            paisUE = ("Fora UE");
        }
        return paisUE;
    }


    public String getTipusSucursal() {
        return tipusSucursal;
    }

    public void setTipusSucursal(String tipusSucursal) {
        this.tipusSucursal = tipusSucursal;
    }
}
