package Serialization;

import java.io.*;
// MULTIPLE OBJECTS CAN BE SERIALIZED

// every class that undergoes serialization should implement serializable

class Serialize1 implements Serializable{
	int num1=1;
}
class Serialize2 implements Serializable{
	int num2=2;
}
class Serialize3 implements Serializable{
	int num3=3;
}
public class MulitpleObjects {

	public static void main(String[] args) {
		// every object instance must be created
		Serialize1 ser1=new Serialize1();
		Serialize2 ser2=new Serialize2();
		Serialize3 ser3=new Serialize3();
		
		// now serialization code"creating a stream and writing an object to it
		try {
		FileOutputStream fos = new FileOutputStream("abc.exe");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//every object must be wrirtten
		oos.writeObject(ser1);
		oos.writeObject(ser2);
		oos.writeObject(ser3);
		 
		
		// creating the stream to read an object
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.exe"));
		
		// reading
		//the order must be same in deserialization as the order in serialization 
		Serialize1 s1=(Serialize1)ois.readObject();
		Serialize2 s2=(Serialize2)ois.readObject();
		Serialize3 s3=(Serialize3)ois.readObject();
		
		System.out.println(s1.num1+" "+s2.num2+" "+s3.num3);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class Table1 implements Serializable{
	String order1="Fish";
}
class Table2 implements Serializable{
	String order2="Chicken";
}
class Table3 implements Serializable{
	String order3="Prawan";
}
class Restaurant{ 
	  public static void main(String[] args) {
		  Table1 table1=new Table1();
		  Table2 table2=new Table2();
		  Table3 table3=new Table3();
		  try {
			  FileOutputStream fos = new FileOutputStream("menu.exe");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(table1);
				oos.writeObject(table3);
				oos.writeObject(table2);
				
				// this can be in any order now 
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("menu.exe"));
				Object obj =ois.readObject();
				if(obj instanceof Table1) {
					Table1 t1=(Table1)obj;
					System.out.println("table1 received: "+t1.order1);
				}
				else if(obj instanceof Table2) {
					Table2 t2=(Table2)obj;
					System.out.println("table2 received: "+t2.order2);
				}
				else {
					Table3 t3=(Table3)obj;
					System.out.println("table3 received: "+t3.order3);
				}

		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
  
	} 
}
 
