package Generics;

import java.util.ArrayList;

class Generics {
	public static void main(String[] args) {
		ArrayList<String> stringlist=new ArrayList<String>();
		ArrayList list=new ArrayList();
		//needs type casting to store
		String str=(String) list.get(0);
		//no need to type cast
		String str1=stringlist.get(0);
		System.out.println(str1);
		method1(stringlist);
//		ArrayList<Integer> integerlist=new ArrayList<Integer>();
//		m1(integerlist);
		ArrayList<Integer> integerlist=new ArrayList<Integer>();
		method3(integerlist);
//		method2(integerlist);
	}
	public static void method1(ArrayList<String> s) {
		System.out.println("sjf");
	}
	public static void method2(ArrayList<Integer> i) {
		i.add(10);
		i.add(20);
		i.add(3);
		System.out.println(i);
	}
	public static void method3(ArrayList<? extends Number> l) {
		l.add(null);
		System.out.println(l);
	}
	public static void method4(ArrayList<? super Integer> l) {
		l.add(10);
	}
	
}

class GenericValids{
	public static void main(String[] args) {
		// all these 1,2 and 3 are same can add any datatype elements to it
		ArrayList arrlist=new ArrayList<Integer>(); // ==1
//		ArrayList a=new ArrayList<String>(); ==2
//		ArrayList A=new ArrayList<Double>(); ==3
		
		//4 and 5 are same results same
//		ArrayList<String> a= new ArrayList<String>(); ==4
//		ArrayList<String> a=new ArrayList(); ==5
		
		arrlist.add(10);
		arrlist.add("Sam");
		System.out.println(arrlist);
		
//		ArrayList<?> a=new ArrayList<String>(); === valid
//		ArrayList<? extends Number> a= new ArrayList<Integer>(); === valid
//		ArrayList<?> a=new ArrayList<?>(); === valid

		
	}
}

class Genricclasses{
	public static void main(String[] args) {
		Test<Integer> t= new Test<Integer>(10);
		System.out.println(t.getValue());
	}
}

class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getValue() {
		return obj;
	}
}

class Generictype{
	public static void main(String[] args) {
		ArrayList<String> arrlist =new ArrayList<String>(); 
		arrlist.add("Ravi");
//		arrlist.add(10);  === invalid 
		
		// now passing this generic object to nongenric object 
		nonGenericMethod(arrlist);
		System.out.println(arrlist);   //===[Ravi, Siva, 10]
		
	}
	public static void nonGenericMethod(ArrayList l) {
		l.add("Siva");
		l.add(10); // here there is no error when we add an integer element to the list
	}
}
