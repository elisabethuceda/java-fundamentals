public class UsuarioAdminAbstracto extends UsuarioAbstracto {

    public UsuarioAdminAbstracto(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Administrador");
    }
}