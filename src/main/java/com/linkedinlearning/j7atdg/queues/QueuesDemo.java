package main.java.com.linkedinlearning.j7atdg.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueuesDemo {
	public static void main(String[] args) {
		LinkedList<Olive> lList = new LinkedList<>();
		lList.add(new Picholine());
		lList.add(new Kalamata());
		lList.add(1, new Golden());
		lList.addFirst(new Ligurio());
		display(lList);
		
		Olive o1 = lList.peek();
		System.out.println("\n-> by calling lList's peek() method, the 1st item's reference in the list is returned & not removed: " + o1.eName.toString());
		display(lList);
		
		Olive o2 = lList.poll();
		System.out.println("\n-> by calling lList's poll() method, the 1st item's reference in the list is returned & removed simultaneously: " + o2.eName.toString());
		display(lList);
	}
	
	static private void display(Collection<Olive> col) {
		System.out.println("\n\tList order: ");	
		Iterator<Olive> iterator = col.iterator();
		
		while(iterator.hasNext()) {
			Olive olive = (Olive) iterator.next();
			System.out.println("\n" + olive.eName.toString());
		}
	}
}
