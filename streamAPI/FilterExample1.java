package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*	Print even number from list*/

class FilterExample1 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(33);
		ls.add(84);
		ls.add(21);
		ls.add(902);
		ls.add(28);
		ls.add(87);

		/* List to stream object */
		Stream<Integer> stream1 = ls.stream();
		
		/*	Applying filter condition on stream object	*/
		Stream<Integer> stream2=stream1.filter(n -> n % 2 == 0);
		
		/*	Collecting new stream object which is filtered	and converting it into list object	*/
		List<Integer> newLS= stream2.collect(Collectors.toList());
		
		/*	Print list using forEach method or we can use iterator */
		newLS.forEach(s -> System.out.println(s + " is Even number"));

	}

}
