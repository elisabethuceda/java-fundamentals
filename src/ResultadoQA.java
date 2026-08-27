public class ResultadoQA {
    public static void main(String[] args) {
        int[] resultados = {1, 0, 1, 1, 0};
        int casosOK = contarOK(resultados);
        int casosKO = contarKO(resultados);
        System.out.println("Casos OK: " + casosOK);
        System.out.println("Casos KO: " + casosKO);

    }

    public static int contarKO(int[] resultados) {
        int contadorKO = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == 0) {
                contadorKO++;
            }
        }
        return contadorKO;
    }

    public static int contarOK(int[] resultados) {
        int contadorOK = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == 1) {
                contadorOK++;
            }

        }
        return contadorOK;
    }

}



