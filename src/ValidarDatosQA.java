import java.time.LocalDate;

public class ValidarDatosQA {
    public static void main(String[] args) {
        String nombre = "Elisabeth";
        String email = "abc.com";
        System.out.println("Longitud del nombre: " + nombre.length());
        System.out.println("Longitud del email: " + email.length());
        System.out.println("Email contiene @: " + email.contains("@"));
        System.out.println("Email termina en .com: " + email.endsWith(".com"));
        System.out.println("Email es valido: " + emailValido(email));
        System.out.println("Nombre en mayusculas: " + nombre.toUpperCase());

        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);
        LocalDate fecha = LocalDate.of(2026, 8, 30);
        System.out.println("Fecha prueba: " + fecha);
        System.out.println("Fecha es antes de hoy: " + fecha.isBefore(hoy));
        System.out.println("Fecha es despues de hoy: " + fecha.isAfter(hoy));
        System.out.println("Fecha es igual a hoy: " + fecha.isEqual(hoy));
    }

    public static boolean emailValido(String email) {
        return email.contains("@") && email.endsWith(".com")&& email.length() > 5;
    }
}
