public class CasosPendientes {
    public static void main(String[] args) {

        int[] casos = {120, 85, 97, 150, 65};

        for (int i = 0; i < casos.length; i++) {
            if (casos[i] < 100) {
                System.out.println("Proyecto con menos de 100 casos: "+ casos[i]);
            }
        }
    }
}
