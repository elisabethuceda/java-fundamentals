public class Usuario {

    private String nombre;
    private String email;
    private int edad;

    public Usuario(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }

    }

    public void setEdad(int edad) {
        if ((edad >= 0) && (edad <= 120)) {
            this.edad = edad;
        }

    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Edad: " + edad);
    }

}


