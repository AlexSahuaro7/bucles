import java.util.Scanner;

public class tabla_tabla_multiplicar_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int multiplicar=0;

        for (i=0; i<=10; i++){
            multiplicar =i*3;
            System.out.println("3 x "+i+ " = " +multiplicar);
        }
    }
}
