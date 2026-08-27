import java.util.HashMap;

public class GestorCasosQA {
    public static void main(String[] args) {
        int contadorOK = 0;
        int contadorKO = 0;

        HashMap<String, String> resultados = new HashMap<>();
        resultados.put("Login correcto", "OK");
        resultados.put("Login incorrecto", "KO");
        resultados.put("Transferencia", "OK");
        resultados.put("Consulta saldo", "OK");

        contadorOK = contarOK(resultados);
        contadorKO = contarKO(resultados);

        for (String caso : resultados.keySet()) {
            System.out.println("Caso: " + caso + "--> " + resultados.get(caso));
        }

        System.out.println("Total casos OK: " + contadorOK);
        System.out.println("Total casos KO: " + contadorKO);

        System.out.println("¿Existe el caso 'Transferencia'? " + existeCaso(resultados, "Transferencia"));

        try {
            double porcentajeOK = calcularPorcentajeOK(resultados);
            System.out.println("Porcentaje OK: " + porcentajeOK + "%");
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular el porcentaje");
        } finally {
            System.out.println("Proceso finalizado.");
        }


    }

    public static int contarOK(HashMap<String, String> resultados) {
        int contadorOK = 0;
        for (String caso : resultados.keySet()) {
            if (resultados.get(caso).equals("OK")) {
                contadorOK++;
            }
        }
        return contadorOK;
    }

    public static int contarKO(HashMap<String, String> resultados) {
        int contadorKO = 0;
        for (String caso : resultados.keySet()) {
            if (resultados.get(caso).equals("KO")) {
                contadorKO++;
            }
        }
        return contadorKO;
    }

    public static double calcularPorcentajeOK(HashMap<String, String> resultados) {
        int contadorOK = contarOK(resultados);
        return (double) (contadorOK * 100) / resultados.size();
    }

    public static boolean existeCaso(HashMap<String, String> resultados, String caso) {
        return resultados.containsKey(caso);
    }
}

