public class GestionObjUsuarios {


    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                "Elisabeth",
                "email@email.com",
                42);

        usuario1.setEmail("nuevoemail.com");
        System.out.println(usuario1.getEmail());
        usuario1.setEdad(-50);
        usuario1.setEdad(50);
        usuario1.setEdad(150);
        usuario1.mostrarInformacion();

        Usuario usuario2 = new Usuario(
                "Borja",
                "borja@email.com",
                40);
        usuario2.setEmail("nuevo@email.com");
        System.out.println(usuario2.getEmail());
        usuario2.mostrarInformacion();

    }
}
