import java.util.Scanner;

public class CompararUsuarios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce usuario: ");
        String usuario = scanner.next();

        if (usuario.equalsIgnoreCase("admin")) {
            System.out.println("Usuario reconocido");
        } else {
            System.out.println("Usuario no reconocido");
        }

    }
}