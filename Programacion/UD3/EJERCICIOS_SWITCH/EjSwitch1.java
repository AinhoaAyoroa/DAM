import java.util.Scanner;

public class EjSwitch1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 1 y 12: ");
			int mes = sc.nextInt();
			String nomMes = "";
		
		switch(mes){
			case 1: nomMes = "Enero";
				break;
			case 2: nomMes = "Febrero";
				break;
			case 3: nomMes = "Marzo";
				break;
			case 4: nomMes = "Abril";
				break;
			case 5: nomMes = "Mayo";
				break;
			case 6: nomMes = "Junio";
				break;
			case 7: nomMes = "Julio";
				break;
			case 8: nomMes = "Agosto";
				break;
			case 9: nomMes = "Septiembre";
				break;
			case 10: nomMes = "Octubre";
				break;
			case 11: nomMes = "Noviembre";
				break;
			case 12: nomMes = "Diciembre";
				break;
			default: nomMes ="Introduce un numero valido";
				break;				
		}
		System.out.println(nomMes);
		Animales();
}