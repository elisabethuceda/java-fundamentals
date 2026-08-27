public class LoginQA {
    public static void main(String[] args) {

        boolean usuarioCorrecto = true;
        boolean passwordCorrecta = true;
        boolean usuarioBloqueado = false;

        System.out.println("====== LOGIN ======");
        if (!usuarioCorrecto) {
            System.out.println("Usuario incorrecto");
        } else if (!passwordCorrecta) {
            System.out.println("Contraseña incorrecta");
        } else if (usuarioBloqueado) {
            System.out.println("Usuario bloqueado");
        } else {
            System.out.println("Login correcto");
        }
    }
}
