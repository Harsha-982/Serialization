package Collection;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Queue {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		System.out.println(pq.poll());//null
//		System.out.println(pq.remove()); // NoSuchElementException
		for(int i=0;i<10;i++) {
			//to addd
			pq.offer(i);
		}
		System.out.println(pq.poll());//0 removes head value
		System.out.println(pq.peek());//1 shows head value
		System.out.println(pq.element());//1
		System.out.println(pq);
	}
}
class Queue1{
	public static void main(String[] args) {
		
		//add,offer,poll,remove,peek,element
		
		PriorityQueue pq=new PriorityQueue(new MyQueue());
		for(int i=0;i<10;i++) {
			//to add
			pq.offer(i);
		}
		System.out.println(pq);
		
	}
}
class MyQueue implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer int1=(Integer)obj1;
		Integer int2=(Integer)obj2;
		return -int1.compareTo(int2);
	}
}