public class UsuarioQAAbstracto extends UsuarioAbstracto implements Ejecutable {

    public UsuarioQAAbstracto(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: QA");
    }
    @Override
    public void ejecutarPrueba() {
        System.out.println("Ejecutando pruebas QA...");
    }
}
