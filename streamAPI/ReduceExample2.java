package streamAPI;

import java.util.ArrayList;
import java.util.List;

class ReduceExample2 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		
		for (int i = 1; i <=10; i++) {
			ls.add(i);
		}
		
		
		ls.stream().limit(5).forEach(s->System.out.println(s));
		
		
		
		
	}
	
	
}
