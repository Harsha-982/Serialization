package Serialization;
import java.io.*;
//when parent implements serializable then child need not to implement 
class Parent implements Serializable {
	String nameOfFather="Subbarao";
	String nameOfMother="Padma";
}
class Child extends Parent{
	String studentName="Harshavardhini";
}

public class Inheritance {

	public static void main(String[] args) {
		Child child=new Child();
		child.nameOfFather="Togaru Subbarao";
		child.nameOfMother="Togaru Padma";
		child.studentName="Togaru Harshavardhini";
		try {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("form.file"));
		oos.writeObject(child);
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("form.file"));
		Child c1=(Child)ois.readObject();
		
		System.out.println(c1.studentName+" "+c1.nameOfFather+" "+c1.nameOfMother);
		// we get output:-Togaru Harshavardhini Togaru Subbarao Togaru Padma
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
//even child class implememts serializable the code compiles fine because all the values of parent class are available to child 
class Parent1{
	String nameOfFather="Subbarao";
	String nameOfMother="Padma";
	Parent1(){
		System.out.println("Calls parent class");
	}
}
class Child1 extends Parent1 implements Serializable{
	String studentName="Harshavardhini";
	Child1(){
		System.out.println("calls child class");
	}
}

class Inheritance1 {

	public static void main(String[] args) {
		Child1 child=new Child1();
		child.studentName="Togaru Harshavardhini";
		
		// these values will not be serialized
		child.nameOfFather="Togaru Subbarao";
		child.nameOfMother="Togaru Padma";
		try {
		// At the time of serialization non serializable class values are written to file as default values	
			
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("form1.file"));
		oos.writeObject(child);
		
		// At the time of deserialization jvm creates an object for non serializable class values and assigned with its values 
		// is called instance current flow... in which it calls no-arg constructor
		
		//"the parent constructor is called by jvm so "Calls parent class" will gets printed twice...
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("form1.file"));
		Child1 c1=(Child1)ois.readObject();
		
		System.out.println(c1.studentName+" ,"+c1.nameOfFather+" ,"+c1.nameOfMother);
		// output is :-	Togaru Harshavardhini ,Subbarao ,Padma
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
