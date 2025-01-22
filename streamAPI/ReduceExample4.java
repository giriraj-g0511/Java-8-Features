package streamAPI;

import java.util.ArrayList;
import java.util.List;

class ReduceExample4 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("pythonlovesjava");
		ls.add("javadontlovepython");
		
		String name = ls.stream().reduce("",(a,b)->(char)(b.charAt(0)-32)+""+b.substring(1));
		
		System.out.println(name);
		
		
	}
	
}
