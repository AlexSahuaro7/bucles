import java.util.Scanner;

public class invertir_palabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("introduce una palabra");
        palabra = sc.nextLine();

        String palabrareves =""; // variable para crear la palabra del reves
        int posicion = palabra.length() -1; // Se consigue la ultima posicion de la palabra

        while (posicion>=0){
            palabrareves += palabra.charAt(posicion);
            posicion --;

        }
        System.out.println("palabra al reves: " +palabrareves);
    }
}
