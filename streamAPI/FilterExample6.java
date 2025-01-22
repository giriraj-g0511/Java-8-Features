package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FilterExample6 {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(20);
		ls.add(15);
		ls.add(10);
		ls.add(24);
		ls.add(23);
		ls.add(12);
	
		Stream<Integer> stream1=ls.stream();
		Stream<Integer> stream2=stream1.filter(n->n>15);
		
		/*	If we print stream2 object after the map operation on it then we get IllegalStateException */
		Stream<Integer>	stream3=stream2.map(n->n*2);
		ls=stream2.collect(Collectors.toList());
		ls.forEach(s->System.out.println(s));
		
		
	}

}
