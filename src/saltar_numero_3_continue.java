import java.util.Scanner;

public class saltar_numero_3_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i=1; i<=10; i++){
            if (i == 5 || i ==6){
                continue;
            }
            System.out.println(i);
        }


    }
}
