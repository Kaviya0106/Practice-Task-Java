package week1.task;

//Concept --> Before Swapping a=10; b=20;
// after Swapping : a=20; b=10;
public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
        int temp;   //Temporary Variable used for Swapping 

        temp = a; // stores the value of a(10) into temp
        a = b;    // assign  the value of b(20) to a
        b = temp;// assign the value of temp(10) to b

        System.out.println(a);
        System.out.println(b);
    }

	}

// Alternative method 1 --> a = a + b; b = a - b; a = a - b;  This Method will leads Overflow for Large Numbers 

//Method 2-->a = a ^ b; b = a ^ b; a = a ^ b;