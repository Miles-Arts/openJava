package company.company;

public class CocheMain {

    public static void main(String[] args) {


    //tipo de dato - indentificaror - valor asignado
        String        coche           = "Alfa Romeo";

        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("Blue","Honda","Civic",1430.45,5.4);

        cocheObj2.acelerar(50);
        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();


        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

    }
}
