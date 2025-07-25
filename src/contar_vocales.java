import java.util.Scanner;

public class contar_vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorvocales=0;
        int posicion=0;
        String palabra;
        System.out.println("escribe una palabra");
        palabra = sc.nextLine();

        while (posicion<palabra.length()) {
            char letra = palabra.charAt(posicion);

            char letraminuscula = Character.toLowerCase(letra);

            if (letraminuscula == 'a' || letraminuscula == 'e' || letraminuscula == 'i' || letraminuscula == 'o' || letraminuscula == 'u') {
                contadorvocales ++;
            }
            posicion ++;
        }
        System.out.println("la palabra " +palabra+" tiene "+contadorvocales+" vocales");
    }

}
