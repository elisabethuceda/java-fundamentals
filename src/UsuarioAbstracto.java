public abstract class UsuarioAbstracto {

    protected String nombre;

    public UsuarioAbstracto(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public abstract void mostrarRol();
}
