package com.company;

import java.util.ArrayList;

public class asignaturas {
    private String codigoAsignatura;
    private String nombreAsignatura;
    private String horario;
    private int capacidad;
    private String nombresAlumnos[];
    private String nombresCatedraticos[];

    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<String>(); //utilizar este metodo para revisar numeros de cedula en el proyecto, contains - si no existe -1
        nombres.add("Gustavo");
        nombres.add("Victoria");

        for(String nombre: nombres){    //para ver los nombres en el arreglo;
            System.out.println(nombre);
        }
    }

    public String[] getNombresCatedraticos() {
        return nombresCatedraticos;
    }

    public void setNombresCatedraticos(String[] nombresCatedraticos) {
        this.nombresCatedraticos = nombresCatedraticos;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public String toString(){
        return "Asignatura{"+
                "Codigo Asignatura='"+codigoAsignatura+'\''+
                ", Nombre Asignatura='"+nombreAsignatura+'\''+
                ", Horario='"+horario+'\''+
                ", Capacidad="+capacidad+
                '}';
    }
}
