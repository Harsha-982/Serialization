package Exception;


public class Exceptions{
	// ExceptionInIntializerError "6" 
//	static int m=10/0;
	
	//StackOverflowError       "1"
	void method1() {
		method2();
	}
	void method2() {
		method1();
	}
	public static void main(String[] args) {
//		StringIndexOutOfBoundsException                               "1"
		 String str1="harsha";
		 //System.out.println(str1.charAt(7));
		
		 
		 // ArrayIndexOutOfBoundsException                            "3"
		 	
		Exceptions ex=new Exceptions();
//		ex.method1();// stackoverflow (runtime stack mechanism)
		
		
		int [] arr= new int[5];
//		System.out.println(arr[7]); //exception raises
		        
		 //NullPointerException                                        "4"
		 
		String str=null;
//		str.length();
		
		//ClassCastException==> parent class object to child class     "5"
		
		Object obj1=new Object();
		Object obj2= new String("harsha");
		
		String str3=(String)obj2;// no exception because object refernce is of child class
//		String str2=(String)obj1; // raises exception
		
//ClassNotFoundException:classname if class is not present              "7"
		
		//NumberFormatException                                         "8"
		
		String string="happy";
//		int number=Integer.parseInt(string);
		
	}
}

