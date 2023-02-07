package com.company;


public class Funciones {

    public static <Int> void main(String[] args) {

        //System.out.println("Hola mundo sin método");

        //Una función se escribe y tiene parentesis

        //holaMundo();
        //holaMundo();
        //devolverHolaMundo("Java es fácil");

        int edad = edadHumano();

        String hola = devolverHolaMundo();
        System.out.println(hola);
        holaMundo("Saludos");
        System.out.println(edad);
    }
    //Hola mundo es el Indentifacor
    private static void holaMundo() {

        //System.out.println("Hola mundo desde un método");

    }

    public static void holaMundo(String name) {

        System.out.println("Lunes de " + name);

    }

    private static String devolverHolaMundo() {

        return "Devolver Texto";

    }

    private static <Int> int edadHumano() {

        return 38;
    }
}
