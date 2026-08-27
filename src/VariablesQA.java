public class VariablesQA {
    public static void main(String[] args) {
        String nombre = "Elisabeth";
        String proyecto = "Banco";
        int experiencia = 11;
        double salario = 40700.50;
        boolean aprendiendoAutomatizacion = true;

        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + experiencia + " años de experiencia " + "en el proyecto " + proyecto);
        System.out.println("Actualmente tengo un salario de: " + salario);
        System.out.println("Experiencia en Automatizacion: " + aprendiendoAutomatizacion);

        System.out.println("===== PERFIL QA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Proyecto: " + proyecto);
        System.out.println("Experiencia: " + experiencia + " años");
        System.out.println("Salario: " + salario + " €");
        if (aprendiendoAutomatizacion) {
            System.out.println("Automatización: Sí");
        } else {
            System.out.println("Automatización: No");
        }
        System.out.println("=====================");


    }
}

