import java.util.Scanner;

// Ainhoa Ayoroa Rubio - 20/10/2023

public class Autoevaluacion{
	public static void main (String[] args){
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los grados Kelvin: ");
			float kelvin = sc.nextFloat();
			float celcius;
			
		celcius = kelvin * 546;
			System.out.println("Los grados son los siguientes: " + celcius + " celcius");
	   
	   
		System.out.println("---------------------");
		CuestionFormas();
	}  
	
	
	public static void CuestionFormas(){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduce tu peso en kg:  ");
		float kg = sc.nextFloat();
	System.out.print("Introduce tu estatura en metros:  ");
		float metros = sc.nextFloat();
		
	double imc = Math.round(kg / Math.pow (metros, 2));
	System.out.print("Tu IMC es: " + imc);
	
	}
	
}