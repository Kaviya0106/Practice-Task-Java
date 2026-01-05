package week1.task;

//Concept--> Even- divisible by 2,Odd - not divisible by 2
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
        //Check Condition
        if (num % 2 == 0) { // Checks for Even
            System.out.println("Even");
        } else { //Checks for Odd
            System.out.println("Odd");
        }

	}

}
//Alternative Method --> Using Bitwise Operator 
//if ((num & 1) == 0)
