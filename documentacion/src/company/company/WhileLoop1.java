package company.company;

public class WhileLoop1 {

    public static void main(String[] args) {


        int count = 0;
        while (count < 10) {
            count++; //condición
            if (count == 6)
                break; //termina ejecución al encontrar el 6
                //continue; //salta el valor 6 y continua la iteración

            System.out.println("Crecimiento " + count);

        }
        System.out.println("Fin");
    }
}
