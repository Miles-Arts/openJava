package company.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {


        //Clave   -  Valores
        Map<String, String> personas = new HashMap<>();


        personas.put("A-82828" , "Nombre Apellido 1");
        personas.put("B-82828" , "Nombre Apellido 2");
        personas.put("C-82828" , "Nombre Apellido 3");

        System.out.println(personas);

        for (String value : personas.keySet()) {
            System.out.println(value);
        }

        for (String key : personas.values()) {
            System.out.println(key);
        }

        for (Map.Entry<String , String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
