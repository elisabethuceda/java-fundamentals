public class ExcepcionesQA {
    public static void main(String[] args) {
        try {
            int casosTotales = 100;
            int casosEjecutados = 80;
            int porcentaje = casosEjecutados * 100 / casosTotales;
            System.out.println("Porcentaje de casos ejecutados: " + porcentaje + "%");
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular el porcentaje.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Cálculo finalizado.");
        }
    }
}
