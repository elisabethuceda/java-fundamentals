
import java.util.HashMap;

public class ListaUsuariosQA {

    public static void main(String[] args) {
        HashMap<String, Usuario> usuarios = new HashMap<>();
        usuarios.put("usuario1", new Usuario("Elisabeth", "elisabeth@test.com", 42));
        usuarios.put("usuario2", new Usuario("Borja", "borja@test.com", 30));
        usuarios.put("usuario3", new Usuario("Christian", "christian@test.com", 12));

        Usuario usuario = usuarios.get("usuario1");
        usuario.mostrarInformacion();


    }
}