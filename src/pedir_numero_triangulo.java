import java.util.Scanner;

public class pedir_numero_triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i;
        int j;
        System.out.println("introduce un numero");
        numero = sc.nextInt();

        for (i = 1; i <= numero; i++) { // este es el bucle de fila
            for (j = i; j<= numero; j++) { // este es el bucle de columna, cuantos asteriscos se imprimen en cada fila
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
//Parte 2: for (j = i; j <= numero; j++)
//Este bucle interno se encarga de las columnas, es decir, de cuántos asteriscos se imprimen en cada fila.
//
//👉 Lo importante aquí es que empieza en j = i, no en 1.
//
//Veamos qué pasa fila por fila cuando numero = 5:
//
//🧪 Ejecución paso a paso
//🔹 Fila 1 (i = 1):

//for (j = 1; j <= 5; j++)
//Imprime: ***** → 5 asteriscos


//🔹 Fila 2 (i = 2):
//for (j = 2; j <= 5; j++)
//Imprime: **** → 4 asteriscos
//
//🔹 Fila 3 (i = 3):
//for (j = 3; j <= 5; j++)
//Imprime: *** → 3 asteriscos
//
//🔹 Fila 4 (i = 4):
//for (j = 4; j <= 5; j++)
//Imprime: ** → 2 asteriscos
//
//🔹 Fila 5 (i = 5):
//for (j = 5; j <= 5; j++)
//Imprime: * → 1 asterisco
//
//🎯 ¿Por qué empieza el segundo bucle en j = i?
//Porque queremos que cada fila imprima menos asteriscos que la anterior, así:
//
//En la fila 1 (i = 1): imprime de 1 a 5 → 5 asteriscos
//
//En la fila 2 (i = 2): imprime de 2 a 5 → 4 asteriscos
//
//...
//
//En la fila 5 (i = 5): imprime de 5 a 5 → 1 asterisco
//
//✅ En resumen:
//i → controla cuántas filas hay.
//
//j → controla cuántos asteriscos hay en cada fila.
//
//j = i → hace que se impriman menos asteriscos en cada nueva fila, formando un triángulo decreciente.