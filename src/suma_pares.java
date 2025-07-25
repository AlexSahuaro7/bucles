import java.util.Scanner;

public class suma_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;


        for (i=1; i<=100; i++){
            if (i%2 ==0){
                System.out.println(i);
            }
        }
    }
}
