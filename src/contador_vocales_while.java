import java.util.Scanner;

public class contador_vocales_while {
    public static void main(String[] args) {
        // contar vocales con while
        Scanner sc = new Scanner(System.in);
        String palabra;
        int posicion=0; //crear una variable int posicion para recorrer la palabra
        int contadorvocales=0;
        System.out.println("introduce una palabra");
        palabra = sc.nextLine();

        while (posicion<palabra.length()){
            char letra = palabra.charAt(posicion);// es un metodo de la clase String que devuelve el caracter que esta en la posicion indicada
            char letraminuscula = Character.toLowerCase(letra);
            if (letraminuscula == 'a' || letraminuscula == 'e' ||
                    letraminuscula == 'i' || letraminuscula == 'o' ||
                    letraminuscula == 'u'){
                contadorvocales ++; // Si es vocal suma 1 al contador
            }
            posicion ++;
        }
        System.out.println("la palabra " +palabra+ " tiene " +contadorvocales+ " vocales");
    }
}
