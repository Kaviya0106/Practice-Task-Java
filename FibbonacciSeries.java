package week1.task;

// Concept-->Each number is the sum of previous two numbers.
//Example: 0 1 1 2 3 5 8
public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // No.of.times to print 
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) { // Loop runs 10 time
            System.out.print(a + " ");
            int c = a + b; // sum of previous two
            a = b; // Move the value of b to a 
            b = c;// Stores Next Fibbonacci Series
        }

	}

}
 // Alternative Method--> recursion