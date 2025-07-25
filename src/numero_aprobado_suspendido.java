import java.util.Scanner;

public class numero_aprobado_suspendido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int i;
        int aprobados=0;
        int suspendidos=0;
        int condicionados=0;
        for (i=1; i<=6; i++) {
            System.out.println("introduce el numero");
            numero = sc.nextInt();

            if (numero < 4) {

                suspendidos++;
            } else if (numero >= 5) {

                aprobados++;
            } else if (numero == 4) {

                condicionados++;
            }
        }
        System.out.println("cantidad de aprobados es: "+aprobados);
        System.out.println("la cantidad de suspendidos es: "+suspendidos);
        System.out.println("la cantidad de condicionados es: "+condicionados);
    }
}
