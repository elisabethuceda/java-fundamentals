public class InformeQA {
    public static void main(String[] args) {

        int casosTotales = 120;
        int casosEjecutados = 85;
        int pendientes = calcularPendientes(casosTotales,  casosEjecutados);
        System.out.println("Casos pendientes: " + pendientes);


        System.out.println("====== INFORME QA ======");
        System.out.println("Casos totales: " + casosTotales);
        System.out.println("Casos ejecutados: " + casosEjecutados);

        if (casosEjecutados == casosTotales) {
            System.out.println("Estado: LISTO PARA ENTREGA");
        } else {
            System.out.println("Estado: EN PRUEBAS");

        }

        System.out.println("Generando informe QA...");
    }

    public static int calcularPendientes(int casosTotales, int casosEjecutados) {
        return casosTotales - casosEjecutados;
    }
}
