package week1.task;

// concept:
//Positive → greater than 0
//Negative → less than 0
//Zero → neither positive nor negative

public class CheckPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -5; // stores the Number

        // Check condition
        if (num > 0) { // checks positive 
            System.out.println("Positive number");
        } else if (num < 0) { // Check for negative 
            System.out.println("Negative number");
        } else { // check for number is zero 
            System.out.println("Zero");

	}

}
}

// Alternative Method -->  Using Ternary Operator 
//String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
//System.out.println(result);

