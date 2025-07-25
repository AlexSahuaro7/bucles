import java.util.Scanner;

public class contar_consonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int posicion=0;
        int contadorconsonantes=0;
        System.out.println("Introduce la palabra");
        palabra = sc.nextLine();

        while (posicion<palabra.length()){
            char letra = palabra.charAt(posicion);
            char letraminuscula = Character.toLowerCase(letra);
            if (letraminuscula == 'b' || letraminuscula == 'c' || letraminuscula == 'd' ||
                    letraminuscula == 'f' || letraminuscula == 'g' || letraminuscula == 'h' ||
                    letraminuscula == 'j' || letraminuscula == 'k' || letraminuscula == 'l' ||
                    letraminuscula == 'm' || letraminuscula == 'n' || letraminuscula == 'p' ||
                    letraminuscula == 'q' || letraminuscula == 'r' || letraminuscula == 's' ||
                    letraminuscula == 't' || letraminuscula == 'v' || letraminuscula == 'w' ||
                    letraminuscula == 'x' || letraminuscula == 'y' || letraminuscula == 'z'){
                contadorconsonantes ++;
            }
            posicion ++;
        }
        System.out.println("la palabra "+palabra+" tiene "+contadorconsonantes+" consonantes");
    }
}
