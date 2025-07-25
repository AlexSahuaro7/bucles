import java.util.Scanner;

public class numeros_pares_1_al_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<=10; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
