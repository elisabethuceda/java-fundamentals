public class SumarCasosQA {
    public static void main(String[] args) {
        int[] casos = {120, 85, 97, 150, 65};
        int suma = 0;
        int contador = 0;
        boolean encontrado = false;
        for (int i = 0; i < casos.length; i++) {
            suma += casos[i];
            if (casos[i] < 100) {
                contador++;
            }
            if (casos[i] == 150) {
                encontrado = true;

            }

        }
        double media = (double) suma / casos.length;
        double porcentaje = (double) contador / casos.length * 100;
        System.out.println("Total casos: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("Casos por debajo de 100: " + contador);
        System.out.println("Hay 150 en el array: " + encontrado);
        System.out.println("Porcentaje: " + porcentaje + " %");
    }
}
