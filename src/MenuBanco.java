import java.util.Scanner;

public class MenuBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una opcion del 1 al 4: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado Consultar saldo.");
                break;

            case 2:
                System.out.println("Has seleccionado Hacer transferencia.");
                break;
            case 3:
                System.out.println("Has seleccionado Ingresar dinero.");
                break;
            case 4:
                System.out.println("Has seleccionado Salir.");
                break;
            default:
                System.out.println("Opción no válida.");

        }

    }
}
