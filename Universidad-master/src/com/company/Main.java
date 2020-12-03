package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner rd = new Scanner(System.in);
        alumno al = new alumno("202010020044");
        al.setNombre("Axel");
        al.setEdad(19);
        al.setEstatura(5.10);
        al.setTelefono("5045555555");
        //k

        alumno al2 = new alumno();
        alumno alumnos[];
        alumnos = new alumno[5];

        alumnos[0]=al;
        imprimirInfo(al);

        asignaturas as1 = new asignaturas();
        as1.setCodigoAsignatura("PO001");
        as1.setNombreAsignatura("Programacion Orientada a Objetos");
        as1.setCapacidad(20);
        as1.setHorario("19:30");

        catedraticos ca1 = new catedraticos();
        ca1.setNombreCatedratico("Walter Suazo");
        ca1.setCodigoCatedratico("4005698");
        ca1.setClasesImpartidas(new String[]{"Programacion Orientada","Introduccion a Programacion"});

        System.out.println(as1.toString());
        System.out.println(al.toString());
        System.out.println(ca1.toString());



    }
    public static void imprimirInfo(alumno al){
        System.out.println("Cuenta: "+al.getCuenta()+ "\nNombre: "+al.getNombre());
    }

}
