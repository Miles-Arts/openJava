package company.company;


import javax.swing.*;

public class TryCatchMain {

    public static void main(String[] args) {
        //System.out.println("Iniciando");

        try {

            int result = 5 / 0;

        } catch (ArithmeticException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");

    }
}
