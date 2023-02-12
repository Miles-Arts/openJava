package company.company;

public class ArrayColegio {

    public static void main(String[] args) {

        //array con 1o espacios
        int [] notas = new int[10] ;


        //array con ya asignación de espacios y valores
        int[] notas1 = {8, 10, 5, 9, 8, 7, 6};
        int[] notas2 = {8, 10, 5, 9, 8, 7, 6};


        notas[0] = 8;
        notas[1] = 9;

        //System.out.println(notas[0]); //8

        notas1.binarySearch(notas1, 9);
        notas1.sort(notas1);
        //equals(notas1, notas2);

        for(int i = 0; i < notas1.length; i++) {

            System.out.println(notas1[i]);
        }

        for(int item:notas1) {

            System.out.println(item);

        }
    }
}
