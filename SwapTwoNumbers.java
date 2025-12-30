/Swapping Two Numbers using Third variable 
 //Before Swapping 
  a=10 
  B=20
//After Swapping 
  a=20
  b=10


package week1.day2;

public class SwapTwoNumbers {
  public static void main(String[] args) { 

	        int a = 10;      // First number
	        int b = 20;      // Second number
	        int temp;        // Temporary variable for swapping

	        temp = a;        //  Store value of 'a' in temp
	        a = b;           //  Assign value of 'b' to 'a'
	        b = temp;        //  Assign stored value from temp to 'b'

	        // Display swapped values
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
	}



