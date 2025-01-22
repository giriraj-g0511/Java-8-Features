package streamAPI;

import java.util.ArrayList;
import java.util.List;

class ReduceExample3 {

		public static void main(String[] args) {
			List<String> ls = new ArrayList<String>();
			
			ls.add("sAgAr");
			ls.add("noone");
			ls.add("SomeOne"); 
			
			String concat = ls.stream().reduce("",(a,b) -> a.toLowerCase()+" "+b.toUpperCase());
			System.out.println(concat);
			
			
			
			
		}
		
		
	}
