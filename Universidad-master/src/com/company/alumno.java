package com.company;

import java.util.ArrayList;

public class alumno {
    private String nombre;
    private int edad;
    private double estatura;
    private String cuenta;
    private String telefono;

    public alumno(String cuenta) {
        System.out.println("Soy constructor con parametros");
        this.cuenta = cuenta;
    }
    public alumno(){
        System.out.println("Soy constructor sin parametros");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return "alumno{"+
                "nombre='"+nombre+'\''+
                ", edad="+edad+
                        ", estatura="+estatura+
                        ", cuenta='"+cuenta+'\''+
                ", telefono='"+telefono+'\''+
                '}';


    }
}

