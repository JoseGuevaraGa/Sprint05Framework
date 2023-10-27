package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@ToString
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idusuario;


    @Column(name = "nombreUsuario")
    private String nombreUsuario;


    @Column(name = "fechaRegistro")
    private String fechaRegistro;

    @Column(name = "juegosGanados")
    private int juegosGanados = 0;

    @Column(name = "porcentajeAciertos")
    private double porcentajeAciertos = 0;

    public Usuario(int idusuario, String nombreUsuario, String fechaRegistro, int juegosGanados, double porcentajeAciertos) {
        this.idusuario = idusuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaRegistro = fechaRegistro;
        this.juegosGanados = juegosGanados;
        this.porcentajeAciertos = porcentajeAciertos;
    }

    public Usuario() {
        this.idusuario = idusuario;
    }


    public long getUsuarioID() {
        return idusuario;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public String getFechaRegistro() {
        return fechaRegistro;
    }


    public void setUsuarioID(int idusuario) {
        this.idusuario = idusuario;
    }


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    public double getPorcentajeAciertos() {
        return porcentajeAciertos;
    }

    public void setPorcentajeAciertos(double porcentajeAciertos) {
        this.porcentajeAciertos = porcentajeAciertos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idusuario=" + idusuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", juegosGanados=" + juegosGanados +
                ", porcentajeAciertos=" + porcentajeAciertos +
                '}';
    }

    public void sumaJuegosGanados(){
        juegosGanados++;
    }


}