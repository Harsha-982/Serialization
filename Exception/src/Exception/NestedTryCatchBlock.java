package Exception;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		/*if we don't have an exeception handling code in child block then we can verify our
		 * parent block if found then our parent class will take care of child class.. 
		*/
		int[] arr=new int[5];
		try {
			System.out.println("currently in parent block");
			try {
				System.out.println("entered child try block");
//				i am trying to access element of array which is not present
				System.out.println(arr[10]);
			}
			catch(ArithmeticException e1) {
				System.out.println("child catch block");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("parent catch block");
		}
	}

}
