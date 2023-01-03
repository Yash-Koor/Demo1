package PredicateFunctionalInterfaceExample;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
	String name;
	int salary;
	int experience;
	
	public Employee1(String name, int salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
}

public class PredicateExampleEmpMultObject {
	public static void main(String[] args) {
		
		Predicate<Employee1> p1 = (e)->(e.salary > 30000 && e.experience > 3);
		
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		al.add(new Employee1("Creed",50000, 5));
		al.add(new Employee1("Stanley",20000, 2));
		al.add(new Employee1("Andy",35000, 1));
		al.add(new Employee1("Michael",15000, 4));
		al.add(new Employee1("Dwight",6543210, 6));
		
		
		for(Employee1 e1:al) {
			if(p1.test(e1)) {
				System.out.println("Employee name: "+e1.name+"   Employee salary: "+e1.salary);
			}
		}
	}
}
