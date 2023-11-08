import java.util.Scanner;

public class EjUD3IfElse {
	public static void main (String[] args){
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduce la edad: ");
			int edad = leer.nextInt();
			
		if(edad >= 18){
			System.out.println("Es mayor de edad");
			
			System.out.println("---------------------------");
		}else{
			System.out.println("Es menor de edad");
			
		System.out.println("---------------------------");
		
			
		} // CIERRE ELSE
		Ejercicio4();		
	} // CIERRE CLASE
	
	//public static void ejercicio3 {
		
		
	//}
	
	public static void Ejercicio4() {
		
		int valorMay, valorMen;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduce un valor: ");
			int valor1 = leer.nextInt();
		System.out.print("Introduce otro valor: ");
			int valor2 = leer.nextInt();	
			
		if ( valor1 == valor2 | valor2 == valor1){
			System.out.print("Introduce 2 valores distintos");
			
		} else if ( valor1 > valor2 ) {
			valor1 = valorMay;
			valor2 = valorMen;
		} else {
			valor2 = valorMay;
			valor1 = valorMen;
		}
		 System.out.println("El valor mayor es " + valorMay + " y el menor es " + valorMen); 
		
	} 
	
}
 