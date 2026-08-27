public class UsuarioHerencia {

    protected String nombre;

    public UsuarioHerencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
