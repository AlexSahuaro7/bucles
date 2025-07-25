public class triangulo_decreciente_anidados {
    public static void main(String[] args) {
        int fila;
        int col;
        for (fila=4; fila>=1; fila--){
            //
            for (col=1; col<=fila; col++){
                System.out.print("*");
                // imprime tantos asteriscos como el numero de fila actual
            }
            System.out.println();
        }
    }
}
