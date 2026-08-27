import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        while(numero!=7){
            System.out.println("Número incorrecto. Inténtalo de nuevo.");
            System.out.println("Introduce otro numero: ");
            numero = scanner.nextInt();

        }
        System.out.println("¡Enhorabuena! Has acertado.");
    }
}
