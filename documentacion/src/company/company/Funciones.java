package company.company;

public class Funciones {
    public Funciones() {
    }

    public static <Int> void main(String[] args) {

        holaMundo();
        holaMundo();
        holaMundo("Actitud" , "positiva");
        holaMundo(200);

        /*int edad = edadHumano();
        String hola = devolverHolaMundo();
        System.out.println(hola);

        holaMundo("Saludos" , "Inversión");

        System.out.println(edad);*/
    }

    public static void usuariosActivos() {

        int usuariosActivosL = 2000;

        System.out.println("Usarios en Latam " + usuariosActivosL);
    }

    public static void holaMundo() {
        System.out.println("Startup con Java");
    }

    public static void holaMundo(String name) {
        System.out.println("Lunes de " + name);
    }

    public static void holaMundo(Integer number) {
        System.out.println("Martes de " + number);
    }

    public static void holaMundo(String name, String texto) {
        System.out.println("Año de " + name + " " + texto);
    }

    public static void miGente() {
        System.out.println("Aprendo fácil");
    }

    private static String devolverHolaMundo() {
        return "Devolver Texto";
    }

    private static <Int> int edadHumano() {
        return 38;
    }

    public static int sum ( int number1, int number2) {

        return number1 + number2;

    }

}