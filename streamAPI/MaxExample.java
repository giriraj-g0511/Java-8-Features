package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MaxExample {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(0);
		ls.add(3);
		ls.add(6);
		ls.add(4);
		ls.add(2);
		ls.add(9);

		Comparator<Integer> comp = (o1, o2) -> o1.compareTo(o2);

		int max = ls.stream().max(comp).get();
		System.out.println(max);

	}

}
