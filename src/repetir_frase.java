import java.util.Scanner;

public class repetir_frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numero;
        int contador=0;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("introduce una frase");
        frase = sc.nextLine();
        while(contador<numero){
            System.out.println(frase);
            contador++;

        }
    }
}
