public class UsuarioQA extends UsuarioHerencia {

    private String herramienta;

    public UsuarioQA(String nombre, String herramienta) {
        super(nombre);
        this.herramienta = herramienta;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Usuario QA: " + nombre);
    }

    public void mostrarHerramienta() {
        System.out.println("Herramienta: " + herramienta);
    }
}