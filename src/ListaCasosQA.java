import java.util.ArrayList;

public class ListaCasosQA {

    public static void main(String[] args) {

        ArrayList<String> casos = new ArrayList<>();

        casos.add("Login correcto");
        casos.add("Login incorrecto");
        casos.add("Transferencia");
        casos.add("Consulta de saldo");

        System.out.println("Número de casos: " + casos.size());


        for (String caso : casos) {
            System.out.println("Caso: " + caso);
        }

        boolean existe = casos.contains("Transferencia");
        System.out.println("¿Existe el caso de transferencia? " + existe);
        casos.remove(1);
        System.out.println("Número de casos: " + casos.size());


    }
}