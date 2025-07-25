import java.util.Scanner;

public class tabla_multiplicar_completa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i;
        int j;
        for (i=1; i<=10; i++){
            System.out.println("la tabla del " +i);
            for (j=1; j<=10; j++ ){
                System.out.println(i+"x"+j+"="+(i*j));
// este bucle funciona como un reloj, el bucle externo avanza una vez cada vez que el interno termina sus 10 vueltas
// se repite este proceso hasta que el externo llega a 10
// cada tabla= 10 multiplicaciones -->eso es lo que hace el bucle interno                 
            }
        }
    }
}
