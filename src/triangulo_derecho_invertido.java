import java.util.Scanner;

public class triangulo_derecho_invertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int k;
        int numero;
        System.out.println("introduce un numero");
        numero = sc.nextInt();
        for (i=1; i<=numero; i++){
            for (j =1; j<i; j++){
                System.out.print(" ");

            }
            for (k=1; k<=(numero-i +1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
