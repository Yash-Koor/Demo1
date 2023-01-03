package PredicateFunctionalInterfaceExample;

import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String[] args) {
		Predicate<String> p3 = (s)->(s.length()>4);
		String names[] = {"Tom","Jerry","Steve","John","Bucky"};
		for(String n :names) {
			if(p3.test(n)) {
				System.out.println(n);
			}
		}
	}
}
