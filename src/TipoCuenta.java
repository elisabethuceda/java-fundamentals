import java.util.Scanner;

public class TipoCuenta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tipo de cuenta: ");
        String tipoCuenta = scanner.next();

        switch (tipoCuenta.toUpperCase()) {
            case "AHORRO" -> System.out.println("Interés del 2%.");
            case "CORRIENTE" -> System.out.println("Sin intereses.");
            case "EMPRESA" -> System.out.println("Cuenta para empresas.");
            case "PREMIUM" ->System.out.println("Acceso a ventajas exclusivas.");
            default -> System.out.println("Tipo de cuenta no válido.");
        }
    }
}
