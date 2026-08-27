import java.util.Scanner;

public class MenuRepetitivo {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 3) {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Transferencia");
            System.out.println("3. Salir");

            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Has seleccionado Consultar saldo.");
                case 2 -> System.out.println("Has seleccionado Hacer transferencia.");
                case 3 ->{// Salir del programa
                     }
                default -> System.out.println("Opción no válida.");
            }
        }
        System.out.println("Hasta pronto.");
        scanner.close();
    }
}

