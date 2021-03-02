package eu.senla;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {	
//		
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
// 	String z = list.get(4);
// 	System.out.println(z);
//	
// 	System.out.println(list.indexOf("XXX"));
// 	System.out.println(list.lastIndexOf("ZED"));
// 	
// 	Iterator<String> iterator = list.iterator();
// 	while (iterator.hasNext()) {
// 		System.out.println(iterator.next());
// 	}
//	System.out.println();
		
		MyArrayList<String> myList = new MyArrayList<>();
	 
		myList.add(0, "JACK");
		myList.add(1,"BOB");
		myList.add(2,"BILL");
		myList.add(3,"JOKER");
		myList.add(4,"JAZZ");
		myList.add(5,"XXX");
		System.out.println(myList);
		
		String z = myList.get(5);
	 	System.out.println(z);
	 	
	 	int y = myList.indexOf("JOKER");
	 	
 	System.out.println(y);
 	
// 	Iterator<String> iterator = myList.iterator();
// 	while (iterator.hasNext()) {
// 		System.out.println(iterator.next());
// 	}
		
	}
	
	

}
