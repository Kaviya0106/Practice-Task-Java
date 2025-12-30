package week1.day2;

public class SwappingwithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        int a = 10;  // First number
	        int b = 20;  // Second number

	        a = a + b;   //  Store sum of a and b in 'a'
	        b = a - b;   //  Extract original 'a'
	        a = a - b;   //  Extract original 'b'

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }

	}


