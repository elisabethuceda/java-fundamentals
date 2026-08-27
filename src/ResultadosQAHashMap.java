import java.util.HashMap;

public class ResultadosQAHashMap {
    public static void main(String[] args) {

        HashMap<String, String> resultados = new HashMap<>();
        resultados.put("Login correcto", "OK");
        resultados.put("Login incorrecto", "OK");
        resultados.put("Transferencia", "KO");
        resultados.put("Consulta saldo", "OK");

        System.out.println("Resultado transferencia: " + resultados.get("Transferencia"));
        boolean existe = resultados.containsKey("Login correcto");
        System.out.println("¿Existe el resultado para 'Login correcto'? " + existe);
        resultados.put("Transferencia", "OK");
        System.out.println("Nuevo resultado transferencia: " + resultados.get("Transferencia"));
    }
}
