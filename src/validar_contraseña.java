import java.util.Scanner;

public class validar_contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;
        int i=0;
        boolean tienemayusculas = false;
        boolean tienenumero = false;
        System.out.println("introduce una palabra");
        contraseña = sc.nextLine();

        if (contraseña.length()<8){
            System.out.println("la contraseña debe tener u 8 o mas de 8 digitos");
        }else{
            while (i<contraseña.length()){
                char letra = contraseña.charAt(i);

                if (Character.isUpperCase(letra)) {
                    tienemayusculas= true;
                }
                if (Character.isDigit(letra)){
                    tienenumero = true;
                }
                i++;
            }
            if (tienemayusculas && tienenumero){
                System.out.println("contraseña valida");
            }
            else {
                System.out.println("contraseña invalida");
            }
        }
    }
}
