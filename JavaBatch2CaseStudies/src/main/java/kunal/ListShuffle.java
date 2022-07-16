package kunal;

import java.util.*;

public class ListShuffle {
	public static void main(String args[]) {
		int size, j, i = 0,l=0;
		List<Integer> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of list: ");
		size = scanner.nextInt();

		do {
			System.out.println("Enter digits to ArrayList: ");
			Integer input = scanner.nextInt();
			list.add(input);
			System.out.println(list);

			l++;
		}while(l<size);

		System.out.println("The entered list is " + list);
		j = size - 1;
		List<Integer> list2 = new LinkedList<>();
		for (int k = 0; k < size; k++) {
			if (j >= (size / 2)) {
				addToList(list2, list.get(j));
				j--;
			}
			if (i < (size / 2)) {
				addToList(list2, list.get(i));
				i++;

			}
			k++;
		}
		System.out.println("The shuffled list is " + list2);

		scanner.close();
	}

	private static void addToList(List<Integer> list, Integer values) {
		list.add(values);
	}

}
