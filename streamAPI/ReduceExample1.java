package streamAPI;

import java.util.ArrayList;
import java.util.List;

class ReduceExample1 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		
		for (int i = 1; i <=10; i++) {
			ls.add(i);
		}
		
//		System.out.println(ls);
		
		
//		long count = ls.stream().filter(i->i%2==0).count();
//		System.out.println(count);
		
		long count = ls.stream().reduce(0,(ct,a) -> ((a%2==0)?ct+1:ct));
		System.out.println(count);
		
		
		
		
	}
	
	
}
