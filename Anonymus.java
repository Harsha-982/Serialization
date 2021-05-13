package Inner;

public class Anonymus {
	public static void main(String[] args) {
		
		// this class is anynonymus class with no name 
		Test t=new Test() {
			public void print() {
				System.out.println("debug");
			}
		};
		
		// Anonymus$1;is the dot class file
	t.print();
	System.out.println(t.get(6));
	Test t1=new Test();
	t1.print();
	}
}

class Test{
	public void print() {
		System.out.println("test");
	}
	public int get(int i) {
		return i;
	}
}