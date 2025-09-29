package main.java.com.linkedinlearning.j7atdg.linkedlistdemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Olive> lList = new LinkedList<>();
		lList.add(new Picholine());
		lList.add(new Kalamata());
		//System.out.println("\n" + lList);
		
		lList.add(1, new Golden());
		lList.addFirst(new Ligurio());
		display(lList);
	}
	
	static private void display(Collection<Olive> col) {
		System.out.println("\n\tList order:");
		Iterator<Olive> i = col.iterator();
		
		while(i.hasNext()) {
			Olive o = (Olive) i.next();
			System.out.println("\n" + o.eName.toString());
		}
	}
}
