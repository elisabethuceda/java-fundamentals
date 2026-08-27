import java.util.HashMap;

public class InformeFinalQA {
    public static void main(String[] args) {

        HashMap<String, String> resultados = new HashMap<>();

        System.out.println("===== INFORME FINAL QA - PRUEBA =====");

        resultados.put("Login correcto", "OK");
        resultados.put("Login incorrecto", "KO");
        resultados.put("Transferencia", "OK");
        resultados.put("Consulta saldo", "OK");
        resultados.put("Cambio de contraseña", "KO");
        resultados.put("Cerrar sesión", "OK");

        for (String caso : resultados.keySet()) {
            System.out.println("Caso: " + caso + "--> " + resultados.get(caso));
        }
        int contadorOK = contarOK(resultados);
        int contadorKO = contarKO(resultados);
        System.out.println("Total casos OK: " + contadorOK);
        System.out.println("Total casos KO: " + contadorKO);
        double porcentajeOK = calcularPorcentajeOK(resultados);
        System.out.println("Porcentaje OK: " + porcentajeOK + "%");
        System.out.println("¿Existe el caso 'Transferencia'? " + existeCaso(resultados, "Transferencia"));
        System.out.println("¿Existe el caso 'Pago con tarjeta'? " + existeCaso(resultados, "Pago con tarjeta"));
        System.out.println("Resultado del caso 'Transferencia': " + obtenerResultado(resultados, "Transferencia"));
        System.out.print("Resultado del caso 'Pago con tarjeta': " + obtenerResultado(resultados, "Pago con tarjeta"));

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

    public static String obtenerResultado(HashMap<String, String> resultados, String caso) {
        if (existeCaso(resultados, caso)) {
            return resultados.get(caso);
        } else {
            return "NO ENCONTRADO.";
        }

    }
}
