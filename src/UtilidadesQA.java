public class UtilidadesQA {

    public static final int MAX_INTENTOS = 3;
    public static final int TIMEOUT = 10;
    public static final String ENTORNO = "QA";
    public static int contadorPruebas = 0;

    public static void mostrarTitulo() {
        System.out.println("===== SISTEMA QA =====");
    }

    public static void mostrarMensajeQA() {
        System.out.println("Ejecutando pruebas automáticas...");
    }

    public static void mostrarConfiguracion() {
        System.out.println("Entorno: " + ENTORNO);
        System.out.println("Máximo de intentos: " + MAX_INTENTOS);
        System.out.println("Timeout: " + TIMEOUT + " segundos");
    }
    public static void incrementarPruebas() {
        contadorPruebas++;
    }
}
