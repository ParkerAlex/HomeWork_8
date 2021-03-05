package eu.senla;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {	
		
// 		ArrayList<String> list = new ArrayList<>();
// 		list.add("Hello");
// 		list.add("BOB");
// 		list.add("JACK");
// 		list.add("XXX");
// 		list.add("ZED");
// 		list.add("MON");
//		
// 	System.out.println(list);
//		
// 	String z = list.get(3);
// 	System.out.println(z);
//	
// 	System.out.println(list.indexOf("XXX"));
// 	System.out.println(list.lastIndexOf("ZED"));
// 	
// 	list.remove(1);
// 	System.out.println(list);
// 	
// 	System.out.println();
// 	
// 	list.set(3, "ABBA");
// 	System.out.println(list);
// 	
// 	ArrayList<String> al2 = new ArrayList<String>(list.subList(2,4));
// 	System.out.println(al2);
 	
// 	Iterator<String> iterator = list.iterator();
// 	while (iterator.hasNext()) {
// 		System.out.println(iterator.next());
// 	}
 	
//	System.out.println();
/////////////////////////////////////////////////////////////////////////////////////
		
		MyArrayList<String> myList = new MyArrayList<>();
	 
		myList.add(0, "JACK");
		myList.add(1,"BOB");
		myList.add(2,"BILL");
		myList.add(3,"JOKER");
		myList.add(4,"JAZZ");
		myList.add(5,"XXX");
		myList.add(6,"JOKER");
		myList.add(7,"JAZZ");
		myList.add(8,"XXX");
		System.out.println(myList);
		
		String z = myList.get(5);
	 	System.out.println(z);
	 	
		System.out.println(myList.indexOf("JAZZ"));
		System.out.println(myList.lastIndexOf("JAZZ"));
		
		myList.remove(1);
	 	System.out.println(myList);
	 	
	 	System.out.println();
	 	
	 	myList.set(3, "ABBA");
	 	System.out.println(myList);
	 	
	// 	ArrayList<String> al2 = new ArrayList<String>(list.subList(2,4));
	// 	MyArrayList<String> al2 = new MyArrayList<String>(myList.subList(2,4));
	 //	System.out.println(al2);
	 	
	 
	 	
//	 	myList.add(9,"ZZZ");
//		System.out.println(myList);
 	
// 	Iterator<String> iterator = myList.iterator();
// 	while (iterator.hasNext()) {
// 		System.out.println(iterator.next());
// 	}
		
	}
	
	

}