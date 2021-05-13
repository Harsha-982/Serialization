package Collection;
import java.util.Vector;
import java.util.Stack;
public class Vector1 {
// add,remove,get,firstElement,lastElement
	public static void main(String[] args) {
		Vector vector=new Vector(3);
		// to add
		
		vector.addElement("Harsha");//[Harsha]
		vector.add("Togaru");//[Harsha,Togaru]
		vector.addAll(vector);//[Harsha,Togaru,Harsha,Togaru]
		vector.add(1);
		vector.add(2);
		vector.add(3);
		System.out.println(vector.capacity()); // capacity changes to 12=6*2=>3*2;

		//to remove
		vector.removeElement(1); // does nothing
		vector.removeElement("Harsha");//[Togaru,Harsha,Togaru]
		vector.removeElementAt(1);//[Togaru,Togaru]
	
		
		// to retrive
		System.out.println(vector.get(1));//Togaru
		System.out.println(vector.elementAt(0));
		vector.firstElement();
		vector.lastElement();
		vector.removeAllElements();
	
		System.out.println(vector.size());
		System.out.println(vector.capacity());// initial capacity 10
		}

}

class Stack1{
	
	//add,remove
	//pop,push,get,peek,search
	
	public static void main(String[] args) {
		Stack stack=new Stack();
		int m=(int) stack.push(10);
		for(int i=0;i<m;i++) {
			stack.add(i);
		}
		stack.remove(6);
		stack.pop(); // 9
		stack.pop(); // 8
		System.out.println(stack.get(4));
		System.out.println(stack);//  [10, 0, 1, 2, 3, 4, 5, 6, 7]
		System.out.println(stack.peek());//  7
		System.out.println(stack.search(2));// 5 returns offset
	}
}
