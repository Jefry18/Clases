package com.company;

public class catedraticos {
    private String nombreCatedratico;
    private String clasesImpartidas[];
    private String codigoCatedratico;

    public String getNombreCatedratico() {
        return nombreCatedratico;
    }

    public void setNombreCatedratico(String nombreCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
    }

    public String[] getClasesImpartidas() {
        return clasesImpartidas;
    }

    public void setClasesImpartidas(String[] clasesImpartidas) {
        this.clasesImpartidas = clasesImpartidas;
    }

    public String getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(String codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }
    @Override
    public String toString(){
        return "Catedratico{"+
                "Nombre='"+nombreCatedratico+'\''+
                ", Codigo Catedratico='"+codigoCatedratico+'\''+
                ", Clases Impartidas='"+clasesImpartidas+'\''+
                '}';
    }
}
