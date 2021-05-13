package Inner;

//OUTER CLASS MODIFIER public default,abstract,final strictfp
//INNER CLASS MODIFIER ==OUTER CLASS MODIFIER+ (private, protected,static)

public class Outer {
	class Inner{
		public void print() {
			System.out.println("inner");
			print1();
		}
	}
	public void print1() {
		System.out.println("available");
	}
	
	public static void main(String[] args) {
//		Outer out=new Outer(); ===1
//		Outer.Inner in =out.new Inner(); ===2
//		in.print(); ===3
		
		
//		Outer.Inner in =new Outer().new Inner(); ===1
//		in.print(); ===2
		
		new Outer().new Inner().print();
		System.out.println("Outer class");
	}
}

class Outer1{
	int x=10;
	static int y=20;
	class Inner{
		public void print() {
			// we can access instance variable values of outer class
			System.out.println(x+" "+y);
		}
	}
	public static void main(String[] args) {
		Outer1 out=new Outer1();
		out.call();
	}
	public void call() {
		Inner in=new Inner();
		in.print();
	}
	
}

class NamingConflict{
	int int1=6;
	class Inner{
		int int1=9;
		public void print() {
			int int1=12;
			System.out.println(int1);  // 12
			System.out.println(this.int1);  //9
//			System.out.println(Inner.this.int1); //9
			System.out.println(NamingConflict.this.int1);  //6
		}
	}
	public static void main(String[] args) {
		new NamingConflict().new Inner().print();
	}
}
