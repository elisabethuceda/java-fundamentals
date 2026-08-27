public class InformeUsuario {
    public static void main(String[] args) {
        mostrarInforme("Elisabeth", 120);
        mostrarInforme("Borja", 85);
        mostrarInforme("Christian", 45);
    }
    public static void mostrarInforme(String usuario, int casosEjecutados){
        System.out.println("Usuario: "+ usuario);
        System.out.println("Casos ejecutados: "+ casosEjecutados);
        System.out.println();

    }
}
