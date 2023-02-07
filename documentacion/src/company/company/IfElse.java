package company.company;

public class IfElse {

    public static void main(String[] args) {

        int number = 10;

            boolean check1 = true;
            boolean check = 5 < 10;

            int number1 = 3000;
            int number2 = 500;
            int number3 = 600;
            int number4 = 5700;


        if (number1  < number2 && number2 < number4)  {
            System.out.println("Verdadero");
        } else if(number3 < number4){
            System.out.println("else if");
        } else {
            System.out.println("");
        }
        System.out.println("Fin");
    }
}
