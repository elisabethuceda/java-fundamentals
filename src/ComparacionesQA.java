public class ComparacionesQA {
    public static void main(String[] args) {
        int casosTotales = 120;
        int casosEjecutados = 120;

        boolean todosEjecutados = casosEjecutados == casosTotales;
        if (todosEjecutados) {
            System.out.println("Proyecto listo para entregar");
        }

    }
}
