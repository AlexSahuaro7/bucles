import java.util.Scanner;

public class tabla_multiplicar_generica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i=0;
        int multiplicar;
        System.out.println("introduce un numero");
        numero = sc.nextInt();
        for (i=0; i<=10; i++){
            multiplicar = numero*i;
            System.out.println(+numero+" x " +i+ " = "+multiplicar);
        }
    }
}
