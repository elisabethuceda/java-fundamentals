import java.util.Scanner;

public class ValidarContraseña {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce contraseña: ");
        String contraseña = scanner.next();

        if (contraseña.isEmpty()) {

            System.out.print("La contraseña no puede estar vacía.");

        } else if (contraseña.length() < 8) {

            System.out.print("La contraseña debe tener al menos 8 caracteres.");

        } else if (!contraseña.toUpperCase().contains("QA")) {

            System.out.print("La contraseña debe contener QA.");

        } else {
            System.out.print("Contraseña valida.");
        }
    }
}

