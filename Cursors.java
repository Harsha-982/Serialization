package Collection;
import java.util.*;

class Enumeration1 {
	public static void main(String[] args) {
		//Enumeration e=v.elements()==> only for legacy
		
		Vector vec=new Vector();
		for(int i=0;i<5;i++) {
			vec.addElement(i);
		}
		//creates enumeration 
		Enumeration enumer=vec.elements();
		while(enumer.hasMoreElements()) {
			Integer next=(Integer)enumer.nextElement();
			if(next%2==0) {
				System.out.println(next);
			}
		}
	}
}

class Iterator1{
	public static void main(String[] args) {
		ArrayList arrlist=new ArrayList();
		for(int i=0;i<10;i++) {
			arrlist.add(i);
		}
		System.out.println(arrlist);
		// creates an iterator object
		Iterator iter=arrlist.iterator();
		while(iter.hasNext()) {
			Integer next=(Integer)iter.next();
			if(next%2==0) {iter.remove();}
			else {System.out.println(next);}
		}
		System.out.println(arrlist);
	}
}

class Listiterator{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		ListIterator listiter=list.listIterator();
		while(listiter.hasNext()) {
			Integer next=(Integer)listiter.next();
			if(next==5) {
			listiter.set(15);
			}	
		}
		System.out.println(list);
	}
}