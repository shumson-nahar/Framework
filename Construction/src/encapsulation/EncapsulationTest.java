package encapsulation;

import java.encapsulation.LearnEncapsulation;

public class EncapsulationTest {

	public static void main(String[] arg){
		

        LearnEncapsulation obj1 = new LearnEncapsulation();
		LearnEncapsulation obj2 = new LearnEncapsulation();
		LearnEncapsulation obj3 = new LearnEncapsulation();
		LearnEncapsulation obj4 = new LearnEncapsulation();
		LearnEncapsulation obj5 = new LearnEncapsulation();
		
		obj1.setSalary(50000);
		obj2.setSalary(60000);
		obj3.setSalary(70000);
		obj4.setSalary(80000);
		obj5.setSalary(90000);
		
		System.out.println(obj1.getSalary());
		System.out.println(obj1.getSalary());
		System.out.println(obj1.getSalary());
		System.out.println(obj1.getSalary());
		System.out.println(obj1.getSalary());
	}

}

		
		
		
		

		

		