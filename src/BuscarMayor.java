public class BuscarMayor {
    public static void main(String[] args) {
        int[] casos = {120, 85, 97, 150, 65};
        int mayor = casos[0];
        for (int i = 1; i < casos.length; i++) {
            if (casos[i] > mayor) {
                mayor = casos[i];
            }
        }
        System.out.println("Mayor valor: " + mayor);

        int menor = casos[0];
        for (int i = 1; i < casos.length; i++) {
            if (casos[i] < menor) {
                menor = casos[i];
            }
        }
        System.out.println("Menor valor: " + menor);
    }
}
