package lambdaFunction;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomizeSort {
	public static void main(String[] args) {
		
		Comparator<Integer> c=(o1,o2)->(o2).compareTo(o1);
		
		TreeSet<Integer> list=new TreeSet<Integer>(c);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(15);
		list.add(10);
		
		System.out.println(list);
 		
	}
}
