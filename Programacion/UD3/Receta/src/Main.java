import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double coliflor = 600;
        double cebolleta = 1;
        int zanahorias = 3;
        double pollo = 500;
        double pinones = 25;
        double pasas = 75;
        double caldo = 220;
        double curry = 1.5;
        int personas;

            System.out.print("Para cuántas personas es la receta: ");
            personas = input.nextInt();

        if( personas < 1){
            personas = 1;

            coliflor = coliflor * personas / 6;

            cebolleta = cebolleta * personas / 6;
            if (cebolleta < 0.5) {
                cebolleta = 0.5;
            }

            zanahorias = zanahorias * personas / 6;
            if (zanahorias < 1) {
                zanahorias = 1;
            }

            pollo = pollo * personas / 6;
            pinones = pinones * personas / 6;
            if (pinones < 10) {
                pinones = 10;
            }

            pasas = pasas * personas / 6;
            if (pasas < 20) {
                pasas = 20;
            }

            caldo = caldo * personas / 6;
            curry = curry * personas / 6;
        }
        if (curry < 0.5) {
            curry = 0.5;
        }

        System.out.printf("Las cantidades necesarias para %d personas son:%n", personas);
        System.out.printf("%.2f gr de coliflor(es)%n", coliflor);
        System.out.printf("%.2f cebolleta(s)%n", cebolleta);
        System.out.printf("%d zanahoria(s)%n", zanahorias);
        System.out.printf("%.2f gr de pechuga de pollo(s)%n", pollo);
        System.out.printf("%.2f gr de piñon(es)%n", pinones);
        System.out.printf("%.2f gr de pasa(s)%n", pasas);
        System.out.printf("%.2f ml de caldo%n", caldo);
        System.out.printf("%.2f cucharilla(s) de curry%n", curry);
    }
}
