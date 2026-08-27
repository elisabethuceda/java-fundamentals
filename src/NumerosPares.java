public class NumerosPares {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 20; numero+=2) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
