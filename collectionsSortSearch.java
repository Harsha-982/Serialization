package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class collectionsSort{
	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(18);
		arrlist.add(3);
		arrlist.add(4);
		// 1   sorting for array list
		Collections.sort(arrlist);
		System.out.println(arrlist);
		
		// 2   customized sorting
		
		Collections.sort(arrlist,new Mycomparator());
		System.out.println(Collections.binarySearch(arrlist,4,new Mycomparator()));// index number 3.. 
		System.out.println(arrlist);   //[20,18,10,4,3]
	}
}

class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer int1=(Integer)obj1;
		Integer int2=(Integer)obj2;
		return -int1.compareTo(int2);
		
	}
}

class CollectionSearch{
	
	//search can be default natural binary searching and even customized search 
	//binarySearch returns integer value
	
	public static void main(String[] args) {
		ArrayList arrlist=new ArrayList();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(18);
		arrlist.add(3);
		arrlist.add(4);
		System.out.println(Collections.binarySearch(arrlist,10));// 0 index because not sorted
		Collections.sort(arrlist);
		System.out.println(Collections.binarySearch(arrlist,10));// 2 
		System.out.println(Collections.binarySearch(arrlist,5));//-3(insertion point i.e,value 5 can be placed at 3rd index)
		//because value is not there
		
		System.out.println(arrlist);
		
	}
}

class CollectionsReverse{
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("happy");
		arr.add("sad");
		arr.add("tensed");
		arr.add("cheerfull");
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
	}
}
