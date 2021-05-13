package Inner;

public class NestedInner {
	class NestedInner2{
		class NestedInner3{
			public void print() {
				System.out.println("Nested inner class");
			}
		}
	}
	public static void main(String[] args) {
		new NestedInner().new NestedInner2().new NestedInner3().print();//  Nested inner class 
	}
}

class MethodLocalInnerClasses{
	public void method() {
		System.out.println("Method");
		class InnerClass{
			public void method1(){
				System.out.println("Method local inner classes");
			}
		}
		// can call this inner class only in the current method...only..
		new InnerClass().method1();
		
	}
	public static void main(String[] args) {
		new MethodLocalInnerClasses().method();
	}
}
