package shekhar.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("shekhar");
		linkedList.add("arun");
		linkedList.add("Veer");
		linkedList.add("Bob");
		linkedList.add(1, "John");
		System.out.println(linkedList);
		
		Iterator<String> iterator =  linkedList.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		linkedList.offer("Anant");
		System.out.println(linkedList);
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList);
		
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		
		linkedList.push("Michael");
		System.out.println(linkedList);
		
		System.out.println(linkedList.pop());
		System.out.println(linkedList);
		
		//push, pop, peek, pool are all part of Deque and Queue Interface
	}

}
