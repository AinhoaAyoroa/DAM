import java.util.Scanner;

// volver a hacer

public class Billete{
    public static void main (String[] args){
     
        Scanner input = new Scanner(System.in);

        double km = 0.0;
        int billete = 0;
        double resultado = 0.0;
        char r;
        double descuentoKm = 0.0;
        double descuentoInterrail = 0.0;
        boolean mayor = false;

        do{
        System.out.println("Elige el tipo de billete");
        System.out.println("1. sencillo (0.33 eur / km)");
        System.out.println("2. ida y vuelta (0.26 eur / km)");
            billete = input.nextInt();

        if(billete != 1 || billete != 2 ){
            System.out.println("- Debes elegir 1 o 2. Vuelva a intentarlo -");
        }while(billete != 1 || billete != 2);

        }if(billete == 1){
            resultado = 0.26 * km; 
        }else{
            resultado = 0.33 * km;    
        }


        System.out.println("Cuántos km vas a viajar?");
        km = input.nextDouble();

        if(km >= 110){
            descuentoKm = resultado * 0.10;
             
        }else if (km >= 50){
            descuentoKm = resultado * 0.05; 
        } 

        System.out.println("Tienes una tarjeta Interrail? (s/n)");
        r = input.next().charAt(0);
        if(r == 's'){
            descuentoInterrail = resultado * 0.25;
            
        }
        if (mayor == true){
            System.out.printf("Se te hará un descuento del 25 por ciento, total a pagar: %d.2f eur", descuentoInterrail);
        }else if (km >= 110){
            System.out.printf("Se te hará un descuento del 10 por ciento, total a pagar: %d.2f eur", descuentoKm);
        }else{
            System.out.printf("Se te hará un descuento del 5 por ciento, total a pagar: %d.2f eur", descuentoKm);
        }
        
        System.out.printf("Total a pagar: %d.2f eur", resultado);

    }
}






