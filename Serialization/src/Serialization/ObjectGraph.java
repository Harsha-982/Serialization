package Serialization;
import java.io.*;
// Every class except the the last class has refernce of other class in it 
//so when we serialize Dog class object all class properties of all class objects gets serialized
class Dog implements Serializable{
	Cat c=new Cat();
	String dogsound="bow-bow";
}
class Cat implements Serializable{
	Rat r=new Rat();
	String catsound="meow-meow";
}
class Rat implements Serializable{
	String ratsound="keech-keech";
}
public class ObjectGraph {
	public static void main(String[] args) throws Exception {
		Dog d=new Dog();
		FileOutputStream fos= new FileOutputStream("c");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis= new FileInputStream("c");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.dogsound+" "+d1.c.r.ratsound+" "+d1.c.catsound);
	}
}
