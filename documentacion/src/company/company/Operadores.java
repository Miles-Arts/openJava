package company.company;

public class Operadores {

    public static void main(String[] args) {


        //operadores

        //arimecticos
        // + -  * %

        int number1 = 10;
        int number2 = 20;

        int resultado = number1 + number2;

        resultado = number1 * number2; //sobre escribiendo la variable

        int number3 = number1 - number2;

        //LOGICOS DE COMPARACIÓN
        /*
        <
        >
        <=
        >=
        <>
        ||  UNO U OTRO
        &&   AMBOS
        ==   IGUAL
        !=  DIFERENTE
        !  LO OPUESTO
        /*
         */

         //ASIGNACIÓN
        /*
        =
        += OPERACION ARITMETICA Y ASIGNAR DE UN VEZ EL RESULTADO SOBRE UNA VARIABLE
        -= /=  *= +=
        %=
        % RESTO

         */

        //INCREMENTO   ++
        //DECREMENTO   --



        //COCATENACIÓN    +






        System.out.println("---");
        System.out.println(number3);
        System.out.println(resultado);

    }

    public static class Funciones {

        public static <Int> void main(String[] args) {


            int edad = edadHumano();

            String hola = devolverHolaMundo();
            System.out.println(hola);
            holaMundo("Saludos");
            System.out.println(edad);
        }

        public static void holaMundo() {
            System.out.println("Startup con Java");
        }

        public static void holaMundo(String name) {

            System.out.println("Lunes de " + name);

        }

        protected static void miGente() {
            System.out.println("Aprendo fácil");
        }

        public static String devolverHolaMundo() {

            return "Devolver Texto";

        }

        private static <Int> int edadHumano() {

            return 38;
        }
    }
}
