package PredicateFunctionalInterfaceExample;

import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (i)-> (i>10);
		
		System.out.println(p1.test(20));
		System.out.println(p1.test(5));
	}
}
