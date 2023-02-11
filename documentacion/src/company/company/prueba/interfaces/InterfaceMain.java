package company.company.prueba.interfaces;

import company.company.Coche;

public class InterfaceMain {

    public static void main(String[] args) {


    CocheService service = new CocheServiceSportImpl();
    //CocheService service1 = new CocheServiceClassicIplm();
    //CocheService service2 = new CocheServiceSportImpl();


    //Coche coche1 = service1.crearCocheDemo();
    Coche coche = service.crearCocheDemo();
        //Coche coche2 = service2.crearCocheDemo();

    }

}
