public class ValidarEntrega {
    public static void main(String[] args) {

        boolean listo = proyectoListo(120, 120);
        if (listo) {
            System.out.println("Proyecto listo para entregar.");
        } else {
            System.out.println("Quedan pruebas pendientes.");
        }
    }

    public static boolean proyectoListo(int casosTotales, int casosEjecutados) {
        return casosTotales == casosEjecutados;
    }

}
