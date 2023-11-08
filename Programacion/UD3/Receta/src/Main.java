import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double coliflor = 600;
        double cebolleta = 1;
        double zanahorias = 3;
        double pollo = 500;
        double pinones = 25;
        double pasas = 75;
        double caldo = 220;
        double curry = 1.5;
        int personas;

        System.out.print("Para cuántas personas es la receta: ");
            personas = input.nextInt();


        coliflor = coliflor * personas / 6;
        cebolleta = cebolleta * personas / 6;
        zanahorias = zanahorias * personas / 6;
        pollo = pollo * personas / 6;
        pinones = pinones * personas / 6;
        pasas = pasas * personas / 6;
        caldo = caldo * personas / 6;
        curry = curry * personas / 6;

        System.out.printf("Las cantidades necesarias para %d personas son:%n", personas);
        System.out.printf("%.3f gr de coliflor%n", coliflor);
        System.out.printf("%.3f cebolleta(s)%n", cebolleta);
        System.out.printf("%.3f zanahoria(s)%n", zanahorias);
        System.out.printf("%.3f gr de pechuga de pollo%n", pollo);
        System.out.printf("%.3f gr de piñones%n", pinones);
        System.out.printf("%.3f gr de pasas%n", pasas);
        System.out.printf("%.3f ml de caldo%n", caldo);
        System.out.printf("%.3f cucharillas de curry%n", curry);
    }
}
