package company.company.prueba.interfaces;

import company.company.Coche;
import company.company.CocheElectrico;

public class CocheServiceClassicIplm implements CocheService{


    @Override
    public Coche crearCocheDemo() {

        System.out.println("Creando coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}
