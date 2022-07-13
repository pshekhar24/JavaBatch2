package shekhar.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorBenifits {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(9);
		intList.add(10);
		intList.add(1);
		intList.add(5);
		intList.add(1);
		
		// not allowed to modify while looping
		/*
		for (int e : intList) {
			intList.add(0, new Integer(e));
		}
		*/
		
		ListIterator<Integer> iterator = intList.listIterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(intList);

	}

}
