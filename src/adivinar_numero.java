import java.util.Scanner;

public class adivinar_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 7;
        int intento=0;
        System.out.println("introduce un numero del 1 al 10");

        while (intento != numero) {
            System.out.println("ingresa un numero");
            intento = sc.nextInt();
            if (intento != numero){
                System.out.println("numero incorrecto");
            }

        }
        System.out.println("el numero es correcto");
    }
}