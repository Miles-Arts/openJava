package company.company;


public class TryCatchMain {

    public static void main(String[] args) {

        //System.out.println("Iniciando");

        try {

            int result = 5 / 0;

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Fin");

    }
}
