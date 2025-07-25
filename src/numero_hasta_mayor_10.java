import java.util.Scanner;

public class numero_hasta_mayor_10 {
    public static void main(String[] args) {
        // Pide al usuario que introduzca un numero. Repite el proceso hasta que el numero introducido sea mayor que 10
        Scanner sc = new Scanner(System.in);
        int numero;


        do {
            System.out.println("introduce un numero:");
            numero = sc.nextInt();
        }while (numero<=10);
        System.out.println("correcto has introducido "+numero);
    }
}
