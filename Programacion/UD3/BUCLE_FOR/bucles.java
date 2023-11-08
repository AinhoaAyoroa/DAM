import java.util.Scanner;

public class  bucles{
    public static void main (String[] args){
        int numero = 0;
        int total= 0;

         while (numero < 10) {
            numero++;
            total += numero;
            System.out.println(numero);
        } 
        System.out.println(total);
        
        numero = 1;
        System.out.println("-----------------");

        for(int i=1; i<=10; i++){
            System.out.println(i);
             total +=  i;
            
        }
        System.out.println(total);
        System.out.println("-----------------");
        numero = 0;

        do{
            numero++;
                System.out.println(numero);
            total += numero;
                System.out.println(total);
    }while(numero == 10);

        System.out.println("-----------------");
        TablaMulti();
    } 

    

    public static void TablaMulti(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }
        System.out.println("-----------------");
        SumaSerie();
    }

    public static void SumaSerie(){
        Scanner input = new Scanner(System.in);

        int num;

        do{
        System.out.println("Introduce un numero entero mayor que 10: ");
            num = input.nextInt();

        if(num <= 10){
            System.out.println("El numero debe ser mayor que 10. Intentalo de nuevo");
        }
        }while(num <=10);

        int suma = 0;
        int termino = 1; // actua como contador

        for(int i=1; i<=num; i++){
            suma += termino;
            System.out.println(termino);

            if(i < num){
                System.out.println("+");
            }
            termino += 3;
        }
        System.out.println("=" + suma);
        input.close();
    }
}