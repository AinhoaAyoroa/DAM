
	public class ej1Parse {
		public static void main (String[] args){
			stringToInt();	// String = "2"
			intToString();	// int numero = 1985
			charToString();	// char letra = 'p';
			//stringToBoolean();	// String texto = "true";
			//stringToDouble();	//String texto = "2.5";
		}
		public static void stringToInt(){
			String texto ="2";
			int numero = Integer.parseInt(texto);
				System.out.println("El String convertido en int es: " + numero);
		}
		
		public static void intToString(){
			int num = 1985;
			String texto2 = Integer.toString(num);
				System.out.println("El int convertido en String es: " + texto2);
		}
	 
		public static void charToString(){
			char cadena = 'P';
			int num2= Character.toString(cadena);
				System.out.println("El char convertido en int es: " + num2);
			
		}
	 
	} // cierre main 	
	
	 