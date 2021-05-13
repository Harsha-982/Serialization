package Inner;

public class StaticClass {
	static class Static{
		public void print() {
			System.out.println("static class");
		}
		public static void main(String[] args) {
			System.out.println("static methods are allowed in static nested classes");
		}
	}
	public static void main(String[] args) {
		//can call directly without outer class object
		Static stat= new Static();
		stat.print();
	}
}

// static methods are not allowed for inner classes 
// but for static nested classes we can have static classes...
