import java.util.Scanner;

public class marco_asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;
        int columna;
        int n=5;

        for (fila=0; fila<n; fila++){ // la fila imprime de arriba a abajo
            for (columna=0; columna<n; columna++){ // la columna imprime de izquierda a derecha
                if (fila==0 || fila == n-1 || columna == 0 || columna == n -1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
//Ejercicio 6: Marco de asteriscos
//Descripción: Muestra un cuadrado de n x n donde los bordes están formados por asteriscos y el centro está vacío (espacios).
//
//Ejemplo (n = 5):
//
//markdown
//Copiar
//Editar
//*****
//*   *
//*   *
//*   *
//*****  dame pistas de como se hace

// if (fila == 0 || fila == n - 1 || columna == 0 || columna == n - 1)
//Esta condición comprueba si estamos en los bordes del cuadrado:
//
//fila == 0 → primera fila
//
//fila == n - 1 → última fila
//
//columna == 0 → primera columna
//
//columna == n - 1 → última columna
//
//Si se cumple cualquiera de estas condiciones, estamos en el borde → se imprime *.