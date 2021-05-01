package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  Try implements Serializable{
	String username="Harhavardhini";
	
	//if any variable is transient variable then it saves its default value in network 
		transient String password="harsha.togaru";
		
	/*making final as transient has no use because final is saved directly with
	 value because it gets replaced by the value at "CE"*/
		transient final int Number=108;
	
	//"static variable is class level variable so it is never a part of serialization
	static int age=10;
	
	/*Even though the variable is transient the static variable is directly available to the object 
	 so it prints value insted of default value.. so there  is no use in using keyword for static variables..*/
	transient static long phonenumber=9849874543L;
	
	public static void main(String[] args) throws Exception {
		Try t=new Try();
		//serialization
		FileOutputStream fos= new FileOutputStream("c.exe"); 
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		//deserialization
		FileInputStream fis= new FileInputStream("c.exe");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		Try d2= (Try)ois.readObject();
		
		System.out.println(d2.username+" "+d2.age+" "+d2.password+" "+d2.phonenumber);
		// output           Harhavardhini   10           null            9849874543 
		
	}
}

