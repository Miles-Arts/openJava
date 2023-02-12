package company.company;

import javax.swing.*;

public class StringMain {

    public static void main(String[] args) {


        //La clase String

        /*

        length()
        startsWith("")
        endsWitch("")
        IndexOf(1,5)
        trim()
        equals()
        compareTo

         */

        String mensaje = "Hola mundo";
        String mensajeEsp = "      Hola mundo ";
        String mensajeOtr = "HOLA MUNDO";

        System.out.println(mensaje.length());

        String mensajeMAY =  mensaje.toUpperCase();
        System.out.println(mensajeMAY);

        System.out.println(mensajeEsp.trim());

        //System.out.println();

        //if (mensajeMAY.equals(mensajeOtr)) {
       if (mensajeMAY.equalsIgnoreCase(mensajeOtr)) {
            System.out.println("Verdadero");

        }
    }
}
