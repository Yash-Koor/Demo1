package PredicateFunctionalInterfaceExample;

import java.util.function.Predicate;

public class PredicatesMultJoin {
	public static void main(String[] args) { 
		int a[] = {5,10,15,20,60,35,40,56,68,73,2,72,80};
		
		Predicate<Integer> p1 = (i)-> i%2 == 0;
		Predicate<Integer> p2 = (i)-> i>30;
		
		for(int n : a) {
			if(p1.and(p2).test(n)) {
				System.out.print(n+" ");
			}
		}
		System.out.println("-----------------");
		for(int n : a) {
			if(p1.or(p2).test(n)) {
				System.out.print(n+" ");
			}
		}
		System.out.println("-----------------");
		for(int n : a) {
			if(p2.negate().test(n)) {
				System.out.print(n+" ");
			}
		}
		
	}
}
