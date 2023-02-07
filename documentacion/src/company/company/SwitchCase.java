package company.company;

public class SwitchCase {

    public static void main(String[] args) {

        //String weather = "sunny";
        String weather = "cloudy";

        switch (weather) {

            case "sunny":
                System.out.println("Día de soleado");
                break;
            case "cloudy":
                System.out.println("Día de nublado");
                break;
            default:
                System.out.println("No se identifica clima");
                break;
        }
    }
}
