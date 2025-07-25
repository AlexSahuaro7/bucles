import java.util.Scanner;

public class adivinar_numero_secreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("introduce el numero secreto");
            numero = sc.nextInt();

        }while (numero !=7);

        System.out.println("el numero es correcto");
    }
}

