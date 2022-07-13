package assenment;

import java.util.*;

public class ListShuffle {
	public static void main(String args[]) {
		int size, end, start = 0, l = 0;
		List<Integer> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of list: ");
		size = scanner.nextInt();
		System.out.println("The entered list is " + list);
		end = size - 1;

		while (end < size) {
			l++;
			int input = scanner.nextInt();
			list.add(input);
			System.out.println(list);
		}
		List<Integer> list2 = new LinkedList<>();
		for (int a = 0; a < size; a++) {
			if (end >= (size / 2)) {
				addToList(list2, list.get(end));
				end--;
			}
			if (start < (size / 2)) {
				addToList(list2, list.get(start));
				start++;

			}
			a++;
		}
		System.out.println("The shuffled list is " + list2);

		scanner.close();
	}

	private static void addToList(List<Integer> list, Integer values) {
		list.add(values);
	}

}
