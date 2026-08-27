public class PrincipalQAHerencia {

    public static void main(String[] args) {

        UsuarioQA usuario = new UsuarioQA(
                "Elisabeth",
                "Playwright"
        );
        UsuarioAdmin admin = new UsuarioAdmin(
                "Elisabeth",
                "Administrador"
        );

        usuario.mostrarNombre();
        usuario.mostrarHerramienta();

        admin.mostrarNombre();
        admin.mostrarRol();
        UsuarioHerencia usuario1 =
                new UsuarioQA("Elisabeth", "Playwright");

        UsuarioHerencia usuario2 =
                new UsuarioAdmin("Borja", "Administrador");
        usuario1.mostrarNombre();
        usuario2.mostrarNombre();
        UsuarioHerencia[] usuarios = {
                new UsuarioQA("Elisabeth", "Playwright"),
                new UsuarioAdmin("Borja", "Administrador"),
                new UsuarioQA("Christian", "Selenium")
        };
        for (UsuarioHerencia usuarioActual : usuarios) {
            usuarioActual.mostrarNombre();
        }
    }
}

