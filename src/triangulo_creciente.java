import java.util.Scanner;

public class triangulo_creciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i;
        int j;
        System.out.println("introduce un numero: ");
        numero = sc.nextInt();
        for (i=1; i<=numero; i++){  //numero de filas
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
// Fila 1: 1 asterisco  → i = 1 → j = 1
//Fila 2: 2 asteriscos → i = 2 → j = 1, 2
//Fila 3: 3 asteriscos → i = 3 → j = 1, 2, 3