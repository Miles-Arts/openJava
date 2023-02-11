package company.company.prueba.interfaces;

import company.company.Coche;
import company.company.CocheElectrico;
import company.company.prueba.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche Deportivo");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
