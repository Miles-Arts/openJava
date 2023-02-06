package com.company;

public class Funciones {


    public static void main(String[] args) {

        System.out.println("Hola mundo");

        String hola = "Hola mundo";

        //Una función se escribe y tiene parentesis

        holaMundo();

    }

    //Hola mundo es el Indentifacor
    private static void holaMundo() {

        System.out.println("Hola mundo desde un metodo");

    }


    private static String devolverHolaMundo() {
        System.out.println("Hola gente");
    }

    public static String devolverHolaMundo() {

        this.devolverHolaMundo = devolverHolaMundo;

    }

    System.out.println(holamundo + devolverHolaMundo);

}
