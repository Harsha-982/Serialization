package Assertion;

public class SimpleAssert {
	public static int method1() {
		int num=77;
		return num;
	}
	// private recommended because end user may disable assertion
	private static void main(int x) {
		assert(x>10);
	}

	public static void main(String[] args) {
		int num=10;
		SimpleAssert.main(num);
		// TODO Auto-generated method stub
		// by default assertion are disabled we must enable them to get assertion error
		
//		assert(num>12); // assert(boolean);
		System.out.println(num);
//		assert(num>12):"number should be greater than 12"; // assert(boolean):e;
//		System.out.println("20");
		
		// when we take method return type is must and should
		assert(num>10):method1(); //AssertionError: 77

	}

}
