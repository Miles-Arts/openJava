package company.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        //nombres.add("Nombre 5");

        System.out.println(nombres);


        for(String nombre : nombres  ) {
            System.out.println(nombre);
        }

        List<CocheE> coches  = new ArrayList<>();

        coches.add(new CocheE("Honda civic"));
        coches.add(new CocheE("Mercedes w204"));
        coches.add(new CocheE("Alfa Romeo"));

        System.out.println(coches);

        for(CocheE coche : coches ) {
            System.out.println(coche);
        }
    }
}
