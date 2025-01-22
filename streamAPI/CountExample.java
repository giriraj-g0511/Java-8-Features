package streamAPI;

import java.util.ArrayList;
import java.util.List;

class CountExample {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(0);
		ls.add(3);
		ls.add(6);
		ls.add(4);
		ls.add(2);
		ls.add(9);
		
		long count = ls.stream().count();
		System.out.println(count);
		
	}

}
