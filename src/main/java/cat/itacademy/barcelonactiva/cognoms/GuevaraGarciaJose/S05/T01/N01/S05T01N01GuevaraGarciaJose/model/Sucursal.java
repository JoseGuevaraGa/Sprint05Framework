package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "sucursal")
@Getter
@Setter
@ToString
public class Sucursal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pk_SucursalID;


    @Column(name = "nomSucursal")
    private String nomSucursal;


    @Column(name = "paisSucursal")
    private String paisSucursal;


    public Sucursal(long pk_SucursalID, String nomSucursal, String paisSucursal) {
        this.pk_SucursalID = pk_SucursalID;
        this.nomSucursal = nomSucursal;
        this.paisSucursal = paisSucursal;
    }


    public Sucursal() {


    }

    public long getPk_SucursalID() {
        return pk_SucursalID;
    }


    public String getNomSucursal() {
        return nomSucursal;
    }


    public String getPaisSucursal() {
        return paisSucursal;
    }


    public void setPk_SucursalID(long pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }


    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }


    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "pk_SucursalID=" + pk_SucursalID +
                ", nomSucursal='" + nomSucursal + '\'' +
                ", paisSucursal='" + paisSucursal + '\'' +
                '}';
    }
}