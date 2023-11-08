import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int edad;
        int tiempo;
        char participado;

        do {
            System.out.println("¿Cuál es tu edad? ");
            while (!input.hasNextInt()) /* se ejecutará mientras que el parámetro de entrada de input no sea un número entero*/ {
                System.out.println("Por favor, ingresa una edad válida (número entero): ");
                input.next(); // limpia la entrada incorrecta para que el usuario vuelva a introducir un número  válido
            }
            edad = input.nextInt();

            System.out.println("¿Has participado en una maratón anteriormente? (s/n): ");
            while (true) {
                String respuesta = input.next().toLowerCase();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    participado = respuesta.charAt(0);
                    break;
                } else {
                    System.out.println("Por favor, ingresa 's' para sí o 'n' para no: ");
                }
            }

            System.out.println("¿Cuál fue tu tiempo en la maratón anterior (en minutos)? ");
            while (!input.hasNextInt())  {
                System.out.println("Por favor, ingresa un tiempo válido (número entero): ");
                input.next(); // limpia la entrada incorrecta
            }
            tiempo = input.nextInt();
        } while (edad <= 0 || tiempo <= 0);

        if (edad >= 18 && participado == 's') {
            if (edad < 35 && tiempo < 190) {
                System.out.println("Persona seleccionada");
            } else if (tiempo < 225) {
                System.out.println("Persona seleccionada");
            } else {
                System.out.println("No puede participar");
            }
        } else {
            System.out.println("Persona no seleccionada");
        }
    }
}


