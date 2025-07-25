import java.util.Scanner;

public class bucle_cuadrado_asterisco_anidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        for (i=1; i<=4; i++){
            for (j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// for (int fila = 1; fila <= 4; fila++): controla las 4 filas del cuadrado.
//
//for (int col = 1; col <= 4; col++): imprime 4 asteriscos por fila.
//
//System.out.print("*"): imprime sin salto de línea.
//
//System.out.println() al terminar una fila, baja a la siguiente línea.
