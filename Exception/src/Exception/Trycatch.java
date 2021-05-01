package Exception;

import java.lang.Exception;
public class Trycatch {
	public static void main(String[] args) {
		System.out.println("i am gonna enter into try catch block");
//	AE:- Exception handled by try-catch block...
		try {
			/* we are writing some part of our code here because because we suspect that 
			 * something is wrong with this part
			*/
			System.out.println(2/0);
			System.out.println("statement 2"); // if exception raises then the next statements in that try are not going to execute
		}
		// risky code should always be in try block
		//handling code should be in catch block
		catch(ArithmeticException e) {
			System.out.println("hey you can,t divide an integer value with zero");
		}
		System.out.println("I am done with my try block");
	}
}
class MultipleCatchblock{
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		try {
			System.out.println(10/0);
			System.out.println(arr[3]);
		}
		catch(ArithmeticException e) { //always child class should be first 
			System.out.println("AE");
		}
		catch(Exception e) {
			/*any kind of exception can be handled by this code
			 *  because it is parent class of exception
			*/
			
			System.out.println("please enter a valid index number");
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e) { gives error because after exception we are placing "ArrayIndexOutOFBounds"
		 * System.out.println("handled"); gives exception has already been caught
		 * }
		 */
	}
}
