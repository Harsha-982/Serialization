package Serialization;
import java.io.*;
class Externalize1 implements Externalizable{
	String name="CanaraBank";
	String accountholder="Harsha";
	int accountnumber=1234567890;
	//public no-arg constructor must be present
	public Externalize1() {
		System.out.println("Calls public constructor");
	}
	
	public void writeExternal(ObjectOutput wext) throws IOException {
		wext.writeObject(name);
		wext.writeInt(accountnumber);
	}
	public void readExternal(ObjectInput rext) throws IOException, ClassNotFoundException{
		name=(String)rext.readObject();
		accountnumber=rext.readInt();	
	}
}

public class Externalization {

	public static void main(String[] args) throws Exception {
		Externalize1 ext=new Externalize1();
		
		//calls constructor here once
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("details.file"));
		oos.writeObject(ext);
		
		// At the time of deserialization the jvm creates an object by executing public no arg constructor in its corresponding class
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("details.file"));
		Externalize1 e1=(Externalize1)ois.readObject();
		
		System.out.println(e1.name+" "+e1.accountnumber);
	}
}
