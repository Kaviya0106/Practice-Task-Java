package week1.task;

// Concept--> Factorial of n = n × (n-1) × ... × 1
//Example: 5! = 120
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5; // the value to be calculated
        int fact = 1;// Factorial Starts with 1
        // Looping from 1 to 5
        for (int i = 1; i <= num; i++) {
            fact = fact * i; // Multiplies Factorial value
        }

        System.out.println(fact);
    }

	}

//Alternative Method-->Recursion 
//int fact(int n) {
//return (n == 1) ? 1 : n * fact(n - 1);}
