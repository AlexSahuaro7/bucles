public class piramide_asteriscos {
    public static void main(String[] args) {
        int fila;

        for (fila = 1; fila <= 5; fila++) { // el bucle da cinco vueltas, va desde la fila 1 hasta la fila 5
            //
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
                //este bucle esta dentro del anterior, por eso se ejecuta varias veces por cada fila.
                //int col = 1: empezamos el contador col en 1.
                //
                //col <= fila: el bucle se ejecuta mientras col sea menor o igual que fila.
                //
                //col++: en cada vuelta, aumentamos col en 1.
            }

            System.out.println();
        }
    }
}
