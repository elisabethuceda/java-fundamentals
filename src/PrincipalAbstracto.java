public class PrincipalAbstracto {
    public static void main(String[] args) {
        UsuarioAbstracto usuario1 =
                new UsuarioQAAbstracto("Elisabeth");

        UsuarioAbstracto usuario2 =
                new UsuarioAdminAbstracto("Borja");

        usuario1.mostrarNombre();
        usuario1.mostrarRol();

        usuario2.mostrarNombre();
        usuario2.mostrarRol();
        UsuarioQAAbstracto usuarioQA =
                new UsuarioQAAbstracto("Elisabeth");
        usuarioQA.mostrarNombre();
        usuarioQA.mostrarRol();
        usuarioQA.ejecutarPrueba();
    }
}
