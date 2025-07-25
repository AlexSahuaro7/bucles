import java.util.Scanner;

public class invertir_palabra_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce una palabra:");
        palabra = sc.nextLine();

        String palabraReves = ""; // Inicializamos la cadena vacía para ir construyendo la palabra al revés

        int posicion = palabra.length() - 1; // Comenzamos desde el último carácter
        while (posicion >= 0) {
            palabraReves += palabra.charAt(posicion); // Añadimos la letra actual a la cadena invertida
            posicion--; // Avanzamos hacia atrás
        }

        System.out.println("Palabra al revés: " + palabraReves);
    }
}
