package com.company;

public class Funciones {

    public static void main(String[] args) {

        System.out.println("Hola mundo sin método");

        //Una función se escribe y tiene parentesis

        //holaMundo();
        //holaMundo();
        holaMundo();
        holaMundo("Saludos");
    }
    //Hola mundo es el Indentifacor
    private static void holaMundo() {

        System.out.println("Hola mundo desde un método");

    }

    private static void holeMundo(String name) {

        System.out.println("Hola " + name);

    }
}
