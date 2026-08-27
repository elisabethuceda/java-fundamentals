import java.util.Scanner;

public class  VerificarEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Como te llamas? ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("¿Que edad tienes?");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es " + edad);
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
