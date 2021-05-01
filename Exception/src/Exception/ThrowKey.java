package Exception;
import java.io.*;

public class ThrowKey {
	static ArrayIndexOutOfBoundsException e1;
	static ArithmeticException e = new ArithmeticException();
	public static void main(String[] args) {
		// even we know that it raises exception and next code is not reachable but no exception at compile time..(implict raising of AE)
		System.out.println(10/0);
		
//after throw keyword no statements should be written because at compiler knows those statements are not reachable..(explict raising of AE)
		
		throw e;// ==> throws java.lang.ArithmeticException
//		throw e1; ==> java.lang.NullPointerException-- if object is not created e1 refers to null
	}
}

class Throw{
	public static void main(String[] args) {
//		throw Throw(); // can't throw all objects only throwable objects
	}
}
class NewThrowUnchecked extends RuntimeException{
	public static void main(String[] args) {
		throw new NewThrowUnchecked(); // all subclasses of RuntimeException can be thrown 
	}
}


