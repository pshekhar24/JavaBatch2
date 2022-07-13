package shekhar.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(9);
		intList.add(10);
		intList.add(1);
		intList.add(5);
		intList.add(1);
		
		System.out.println(intList);
		System.out.println(intList.contains(11));
		System.out.println(intList.indexOf(5));
		System.out.println(intList.isEmpty());
		System.out.println(intList.lastIndexOf(1));
		System.out.println(intList.remove(1)); // remove based on index
		System.out.println(intList);
		System.out.println(intList.remove(new Integer(5))); // remove based on object
		System.out.println(intList);
		System.out.println(intList.size());
		System.out.println(intList.get(2));
		System.out.println(intList.set(1, 15)); // replace element at perticulat position
		System.out.println(intList);
		System.out.println(intList.subList(1, 3));// returns new sub list
		intList.add(1, 20);
		System.out.println(intList);

		//loop
		for (int i = 0 ; i < intList.size() ; i++) {
			System.out.println(intList.get(i));
		}
		
		System.out.println("Prining enhanced loop");
		//enhanced loop
		for (int element : intList) {
			System.out.println(element);
		}
		
		//lanbda expression
		intList.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("Iterator");
		Iterator<Integer> iterator =  intList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(intList);
		System.out.println(intList);
	}

}
