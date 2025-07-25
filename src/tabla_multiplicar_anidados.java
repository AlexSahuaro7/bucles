import java.util.Scanner;

public class tabla_multiplicar_anidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //muestra la tabla de multiplicar del 1 al 3 (del 1 al 10)
        for (i=1; i<=3; i++){
            System.out.println("tabla del" +i+ ":");
            for (int j=1; j<=10; j++){
                System.out.println(i+"x"+j+" = " + (i * j));

            }
            System.out.println();
        }
    }
}
