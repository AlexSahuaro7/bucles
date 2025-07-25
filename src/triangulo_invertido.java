import java.util.Scanner;

public class triangulo_invertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;

        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();

        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 3 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}////esto es un ejercicio de prueba

