import java.util.Scanner;

public class contar_aparece_letra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        //Cuenta cuantos caracteres numericos (0-9) hay en una cadena.
        System.out.println("introduce una cadena");
        cadena = sc.nextLine();
        int contadorcaracteres=0;
        for (int i=0; i<cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                contadorcaracteres++;
            }//if (..) es una condicion que comprueba si el caracter actual es un digito.
            // Si el caracter es un numero, entonces incrementa el contador contadorcaracter en 1.
        }
        System.out.println("la cadena contiene "+contadorcaracteres+" digitos");
    }
}
