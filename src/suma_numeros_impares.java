public class suma_numeros_impares {
    public static void main(String[] args) {
        //diseñar un programa que muestre la suma de los 10 primeros numeros impares.
        int i;
        int suma=0;
        for (i=0; i<=19; i++){
            if (i%2!=0){
                System.out.println(i);
                suma += i;

            }

        }
        System.out.print("la suma total es: "+suma);
    }
}
