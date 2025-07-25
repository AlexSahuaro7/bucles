import java.util.Scanner;

public class sumar_hasta_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma=0;


        do {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            suma += numero;


        }while (numero !=0);
        System.out.println("la suma es " +suma);
    }
}
