package company.company;

public class Funciones {
    public Funciones() {
    }

    public static <Int> void main(String[] args) {
        int edad = edadHumano();
        String hola = devolverHolaMundo();
        System.out.println(hola);
        holaMundo("Saludos");
        System.out.println(edad);
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

    public static void miGente() {
        System.out.println("Aprendo fácil");
    }

    private static String devolverHolaMundo() {
        return "Devolver Texto";
    }

    private static <Int> int edadHumano() {
        return 38;
    }
}