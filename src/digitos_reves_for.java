import java.util.Scanner;

public class digitos_reves_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i;
        System.out.println("introduce un numero:");
        numero = sc.nextInt();
        String textonumero = String.valueOf(numero);

        for (i=textonumero.length()-1; i>=0; i--){
            // esto es un bucle que va desde atras hacia delante
            //mientras que i sea mayor igual que 0, el bucle continua, cuando i llega a -1, el bucle se detiene
            //este bucle recorre la cadena desde el ultimo caracter hasta el primero
            // si textonumero = "hola", su longitud es 4, y las posiciones son: h (0), o (1), l (2), a (3) Por eso se empieza en 3 (4 - 1).
            char digito = textonumero.charAt(i);
            System.out.println(digito);
        }
    }
}

