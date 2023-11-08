 import java.util.Scanner;

 public class Sumatorio{ 
	 public static void main(String[] args){

		int result = num1 + num2;

	    Scanner sc = new Scanner(System.in);
	
	    System.out.print("Introduce un número: ");
			int num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
			int num2 = sc.nextInt();
			
			
	
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + result);
		
		sc.close();
	}
}