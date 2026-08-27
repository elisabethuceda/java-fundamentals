public class UsuarioAdmin extends UsuarioHerencia {
    private String rol;

    public UsuarioAdmin(String nombre, String rol) {
        super(nombre);
        this.rol = rol;
    }

    public void mostrarRol() {
        System.out.println("Rol: " + rol);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Usuario ADMIN: " + nombre);
    }
}
