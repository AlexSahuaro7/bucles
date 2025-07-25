public class sumar_5_numeros {
    public static void main(String[] args) {
        int suma=0;
        int i;
        // suma los numeros del 1 al 5 y muestra el resultado

        for (i=1; i<=5; i++){ // mientras i sea menor o igual a 5 incrementar uno

            suma = suma +i;
        }
        System.out.println(suma);
    }
}
