package PredicateFunctionalInterfaceExample;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		Predicate<String> p2 = (s)->(s.length()>4);
		
		System.out.println(p2.test("Tom"));
		System.out.println(p2.test("Jerry"));
	}
}
