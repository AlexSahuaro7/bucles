import java.util.Scanner;

public class contar_letras_mayusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int contador=0;
        int posicion=0;
        System.out.println("introduce una palabra");
        palabra = sc.nextLine();

        while (posicion<palabra.length()){
            char letra = palabra.charAt(posicion);

            if (Character.isUpperCase(letra)){
                contador ++;
            }
            posicion ++;
        }
       System.out.println("la palabra tiene " +contador+ " letras mayusculas");
    }
}
