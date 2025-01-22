package predefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;

class ConsumerExample2 {

	public static void main(String[] args) {
		
		List<Integer> ls=Arrays.asList(10,20,30,40,50,60,70,80);
		
		/* we are passing lambda expression as argument because it formal argument is Consumer c which is functional interface and we use lambda expression for function interface only*/
		ls.forEach(r->System.out.println(r));
		
	}

}
