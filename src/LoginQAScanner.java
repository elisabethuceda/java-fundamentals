import java.util.Scanner;

public class LoginQAScanner {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce usuario: ");
        String usuario = scanner.next();
        System.out.print("Introduce contraseña: ");
        String contraseña = scanner.next();

        boolean usuarioCorrecto = usuario.equals("admin");
        boolean contraseñaCorrecta = contraseña.equals("1234");

        if (!usuarioCorrecto) {
            System.out.println("Usuario incorrecto");
        } else if (!contraseñaCorrecta) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Login correcto.");
        }
    }
}
