package Exception;
import java.io.*;

public class ExceptionPropagation{
	public void dostuff() {
			domorestuff();
			System.out.println("control back to dostuff"); // these are also not going to print because after exception jvm terminates it
			System.out.println(10/0);
		}
	public void domorestuff() {
		System.out.println("control to domorestuff");  // this gtes printed
		System.out.println(10/0); // from here jvm stops the execution of program
		System.out.println("control goes back from domore stuff");
	}
	public  static void main(String[] args) {
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.dostuff();
	}
}
class CheckedException{
	
	//if we use throws keyword then exception must be handled by its caller....here JVM is the caller
	
    public static void main(String[] args) throws IOException  {
    	FileReader file = new FileReader("C:\\Java\\Typecast.java");
        BufferedReader fileInput = new BufferedReader(file);
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
        
        
    	try {
			/* In checked the risky code must be in try catch block(i.e,must handle exception) to avoid compile time errors not at runtime or
			 * use a throws keyword even though code is correct.
			 * 
			 * if we dont do any of the methods then "unreported exception"
			*/
	        FileReader file1 = new FileReader("C:\\Java\\Typecast");
	        BufferedReader fileInput1 = new BufferedReader(file1);
	        // Print first 3 lines of file "C:\test\a.txt"
	        for (int counter = 0; counter < 3; counter++) 
	            System.out.println(fileInput1.readLine());
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}


