package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Dado {
    int caras = 6;


    public int lanzar(){
        return (int)(Math.random()*this.caras) + 1;
    }

}
