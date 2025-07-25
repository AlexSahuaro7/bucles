import java.util.Scanner;

public class menu_simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        String salir;

        do {
            System.out.println(".menu");
            System.out.println("1.saludar");
            System.out.println("2.decir tu nombre");
            System.out.println("3.salir");
            System.out.println("4.elegir opcion:");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("hola");
                    break;
                case 2:
                    System.out.println("Soy programador");
                    break;
                case 3:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }

            }while (menu != 3);

        }
    }

