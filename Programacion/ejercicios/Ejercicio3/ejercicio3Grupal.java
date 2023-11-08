public class ejercicio3Grupal{
	public static void main (String[] args){
	
		int x = 4;
		x++;
		 System.out.println(x);
		int y = x++ + ++x;
		
		// y = (5+1) + 5 = 11 | x++ --> 6 + 1 = 7
		
		
		 System.out.println(y);
		 System.out.println(x);
		y += x + ++x;
		 System.out.println(y);
		 System.out.println(x);
		}
	}