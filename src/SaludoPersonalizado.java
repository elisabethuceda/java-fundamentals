public class SaludoPersonalizado {
    public static void main(String[] args) {
        saludar("Elisabeth");
        saludar("Borja");
        saludar("Christian");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido al curso.");
    }
}
