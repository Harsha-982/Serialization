package Serialization;

import java.io.*;

class Entries implements Serializable{
	 int id=121;
	 transient String pwd="harsha.togaru";
	 transient int pinNum=1234;
	 
	 //encryption; sends the trasient data as encrypred 
	 // when serialization takes place then jvm automatically executes this part of program
	 private void writeObject(ObjectOutputStream oo) throws IOException {
		 oo.defaultWriteObject();   // writes the default values to the file
		 //trasient variables + somw key value is written to the file
		 String enpwd="124"+pwd;
		 int enpin=1234+pinNum;
		 oo.writeObject(enpwd);
		 oo.writeObject(enpin);
	 }
	 //decrption ;to get the data without anyloss 
	 // this method gets executed at the time of deserialization...
	 private void readObject(ObjectInputStream oi) throws Exception {
		 oi.defaultReadObject(); // reads default values for the file 
		 //transient varialble is read from the file
		 String depwd=(String)oi.readObject();
		 int depin=(int)oi.readObject();
		 
		 // "Opposite action of encryption is done at decryption" and assign the value to the corresponding variable
		 
		 pwd=depwd.substring(3);
		 pinNum=depin-1234;
	 }
	 
}
class Demo{
	public static void main(String[] args) throws Exception {
		Entries ent=new Entries();
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(ent);
		
		
		FileInputStream fis= new FileInputStream("abc.ser");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		Entries ent2= (Entries)ois.readObject();
		System.out.println(ent2.id+" "+ent2.pwd+" "+ent2.pinNum);
		//output            121		harsha.togaru		1234
	}
}
