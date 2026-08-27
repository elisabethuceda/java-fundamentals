public class OperacionesQA {
    public static void main(String[] args) {
        int casosTotales = 120;
        int casosEjecutados = 85;
        int pendientes = casosTotales - casosEjecutados;

        int automatizados = 40;
        int manuales = casosEjecutados - automatizados;

        int horasPorCaso = 2;
        int horasTotales = horasPorCaso * pendientes;

        int testers = 4;
        int casosPorTester= casosTotales/testers;

        System.out.println("========== RESUMEN QA ==========");
        System.out.println("Totales: " + casosTotales);
        System.out.println("Ejecutados: " + casosEjecutados);
        System.out.println("Pendientes: " + pendientes);
        System.out.println("Automatizados: " + automatizados);
        System.out.println("Horas estimadas: " + horasTotales);
        System.out.println("Manuales: " + manuales);
        System.out.println("Casos por tester: " + casosPorTester);
        System.out.println("===============================");
    }
}
