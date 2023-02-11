package company.company;

public class PolimorfismoMain {

    public static void main(String[] args) {


        //Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //POLIMORFISMO
    //tipo    base        tipo hijo
        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();


        //INSTANCE comprueba la instacia de la clase,
        //ver de cuál es hijo
        if (coche4 instanceof CocheElectrico) {
            System.out.println("coche eléctico");
        }

        if (coche4 instanceof Coche) {
            System.out.println("coche C");
        }

        if (coche4 instanceof CocheHibrido) {
            System.out.println("coche hibrido");
        }

    }
}
