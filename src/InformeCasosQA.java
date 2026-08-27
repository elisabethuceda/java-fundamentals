public class InformeCasosQA {
    public static void main(String[] args) {
        int[] casos = {120, 85, 97, 150, 65};
        int total = sumarCasos(casos);
        System.out.println("Total casos: " + total);

        int cantidad = contarMenoresDe100(casos);
        System.out.println("Casos por debajo de 100: " + cantidad);

        boolean existe = contieneValor(casos, 200);
        System.out.println("Existe el numero 200: " + existe);

    }

    public static int sumarCasos(int[] casos) {

        int suma = 0;

        for (int i = 0; i < casos.length; i++) {
            suma += casos[i];
        }

        return suma;
    }

    public static int contarMenoresDe100(int[] casos) {
        int contadorMenores = 0;
        for (int i = 0; i < casos.length; i++) {
            if (casos[i] < 100) {
                contadorMenores++;
            }
        }
        return contadorMenores;
    }

    public static boolean contieneValor(int[] casos, int valorBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < casos.length; i++) {
            if (casos[i] == valorBuscado) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }
}


