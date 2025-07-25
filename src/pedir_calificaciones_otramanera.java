import java.util.Scanner;

public class pedir_calificaciones_otramanera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean suspenso = false;
        int i;
        for (i=0; i<5; i++){
            System.out.println("introduce un numero");
            int numero = sc.nextInt();
            if (numero<5){
                suspenso= true;
            }

        }
        System.out.print("el alumno esta suspendido = " +suspenso);
    }
}
