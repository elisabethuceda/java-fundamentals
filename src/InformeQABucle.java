public class InformeQABucle {
    public static void main(String[] args) {
        for (int totalCasosPrueba = 1; totalCasosPrueba <= 5; totalCasosPrueba++) {
            System.out.println("Ejecutando caso de prueba " + totalCasosPrueba);
            if (totalCasosPrueba == 3) {
                System.out.println(" ⚠ Caso con incidencia detectada.");
            }

        }
    }
}
