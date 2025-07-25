import java.util.Scanner;

public class suma_impares_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int suma=0;
        for (i=0; i<=10; i++){
            if (i%2!=0){
                suma += i;

            }
        }
        System.out.println(suma);
    }
}
