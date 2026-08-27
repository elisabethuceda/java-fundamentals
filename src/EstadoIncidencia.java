import java.util.Scanner;

public class EstadoIncidencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce estado de la incidencia: ");
        String estado = scanner.next();

        switch (estado) {
            case "ABIERTA" -> System.out.println("Incidencia pendiente de comenzar.");
            case "EN_PROGRESO" -> System.out.println("Se está trabajando en la incidencia.");
            case "RESUELTA" -> System.out.println("Pendiente de validación por QA.");
            case "CERRADA" ->System.out.println("Incidencia finalizada.");
            default -> System.out.println("Estado no reconocido.");
        }
    }
}
