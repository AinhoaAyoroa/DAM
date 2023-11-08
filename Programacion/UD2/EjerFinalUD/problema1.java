import java.util.Scanner;


public class problema1{
	public static void main (String[] args){
		int x = 144, y = 999;
		int suma = x + y;
		int resta = x - y;
		int division = x / y;
		int multiplica = x * y;
		 System.out.println("Suma: " + suma);
		 System.out.println("Resta: " + resta);
		 System.out.println("Division: " + division);
		 System.out.println("Multiplicacion: " + multiplica);
		 
		 problema2();
	}


	public static void Problema2() {
		
		System.out.println("-----------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible: ");
		 float base = sc.nextFloat();
		System.out.println("Introduzca el IVA: ");
		 float IVA = sc.nextFloat();
		
		 float calc = (IVA + 1 / 100) / base;
		
		System.out.println("Tu factura es de " + calc + " euros");
		
		Problema3();
	}
	
	public static void Problema3(){
		
		System.out.println("Escribe un valor: ");
			String num1	= System.console().readLine();
		System.out.println("Escribe otro valor: ");	
			String num2 = System.console().readLine();
			
		
		if( num1 > num2 ){
			System.out.println("El valor mayor es" + num1);
		}else {
			System.out.println("El valor mayor es" + num2);
		}
		
		Problema4();
	} 
	
	public static void Problema4(){
		
		System.out.println("-----------------------------------"); //separación visual entre statics voids
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la variable h: ");
			 double h = sc.nextDouble();
		System.out.println("Introduzca la variable r: ");
			 double r = sc.nextDouble();
			 
        double volumen = (Math.PI * (r * r) * h) / 3;
	
		System.out.println("El volumen es: " + volumen);

		// Para crear constantes (siempre en mayus) final tipoValor	"nombre_constante"
	
	}	
		
	
}