import java.util.Scanner;

public class contraseña_hasta_java123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;

        do {
            System.out.println("introduce una contraseña");
            contraseña = sc.nextLine();
        }while (!contraseña.equals("java123")); // Si la contraseña no es java123 se repite
        // con el ! si algo es true, con ! se convierte en false
        //mientras la contraseña no sea igual a java123, repite el bucle
        // si le quitase el ! el bucle repitiria siendo la contraseña correcta.
        System.out.println("contraseña correcta");

        }

    }

