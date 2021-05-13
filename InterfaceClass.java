package Inner;

interface Vehicle {
	public void getNoOfWheels();
	static class Scooty implements Vehicle{
		public void getNoOfWheels() {
			System.out.println("2");
		}
	}
}
class Bus implements Vehicle{
	public void getNoOfWheels() {
		System.out.println("6");
	}
}
class Main{
	public static void main(String[] args) {
		Vehicle.Scooty s= new Vehicle.Scooty();
		s.getNoOfWheels();
	}
}

interface Theatre{
	void name();
	interface Popcorn{
		void taste();
	}
}
class Counter1 implements Theatre{
	// we never have to implememt inner class methods when we implements outer class vice versa
	public void name() {
		System.out.println("Surya cinemax");
	}
}
class Counter2 implements Theatre.Popcorn{
	public void taste() {
		System.out.println("50/-Rs");
	}
	public static void main(String[] args) {
		// to call taste  method we created an object
		Counter2 p2=new Counter2();
		p2.taste();
		Counter1 p=new Counter1();
		p.name();
	}
	
}