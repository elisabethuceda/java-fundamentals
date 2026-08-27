import java.util.Arrays;

public class ArrayCasosQA {
    public static void main(String[] args) {
        int [] casos =new int [5];
        casos[0] = 120;
        casos[1] = 85;
        casos[2] = 97;
        casos[3] = 150;
        casos[4] = 65;
        System.out.println("Primer valor: "+ casos[0]);
        System.out.println("Ultimo valor: "+ casos[4]);
        System.out.println("Valores del array: " + Arrays.toString(casos));
    }
}
