package PredicateFunctionalInterfaceExample;

import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	int experience;
	
	public Employee(String na, int sal, int exp) {
		name = na;
		salary = sal;
		experience = exp;
	}
}
public class PredicateExampleEmp1Object {
	public static void main(String[] args) {
//		Employee emp = new Employee("Tom", 50000, 5);
		Employee emp1 = new Employee("Jerry", 20000, 3);
		
		Predicate<Employee> p1 = (e)->(e.salary > 30000 && e.experience > 3);
//		System.out.println(p1.test(emp));
		
		if(p1.test(emp1)) {
			System.out.println(emp1.name);
		}
		else {
			System.out.println("NA");
		}
	}
}
