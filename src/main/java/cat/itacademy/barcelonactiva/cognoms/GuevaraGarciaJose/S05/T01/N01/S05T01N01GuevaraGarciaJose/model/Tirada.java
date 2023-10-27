package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;


public class Tirada extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idtiradas;

    @Column(name = "dado1Resultado")
    private int dado1Resultado;

    @Column(name = "dado2Resultado")
    private int dado2Resultado;

    @Column(name = "ganadas")
    private int ganadas;
    @Column(name = "perdidas")
    private int perdidas;

    @Column(name = "exito")
    private int exito;

    @Column(name = "idusuario")
    private int idusuario;

    public int getIdtiradas() {
        return idtiradas;
    }

    public void setIdtiradas(int idtiradas) {
        this.idtiradas = idtiradas;
    }

    public int getDado1Resultado() {
        return dado1Resultado;
    }

    public void setDado1Resultado(int dado1Resultado) {
        this.dado1Resultado = dado1Resultado;
    }

    public int getDado2Resultado() {
        return dado2Resultado;
    }

    public void setDado2Resultado(int dado2Resultado) {
        this.dado2Resultado = dado2Resultado;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public int getIdusuario() {
        return idusuario;
    }

    @Override
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public String toString() {
        return "Tirada{" +
                "idtiradas=" + idtiradas +
                ", dado1Resultado=" + dado1Resultado +
                ", dado2Resultado=" + dado2Resultado +
                ", ganadas=" + ganadas +
                ", perdidas=" + perdidas +
                ", exito=" + exito +
                ", idusuario=" + idusuario +
                '}';
    }
}
