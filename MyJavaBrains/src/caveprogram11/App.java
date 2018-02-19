package caveprogram11;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		BasePerson basePerson = new BasePerson();
		basePerson.setName("Rama");
		basePerson.setAge(80);
		LocalDate lal = LocalDate.of(1923, 06, 12);
		basePerson.setDob(lal);
		
		BasePerson basePerson1 = new BasePerson();
		basePerson1.setName("Rabi");
		basePerson1.setAge(50);
		LocalDate lal1 = LocalDate.of(1956, 10, 02);
		basePerson1.setDob(lal1);
		
		BasePerson basePerson2 = new BasePerson();
		basePerson2.setName("Mani");
		basePerson2.setAge(30);
		LocalDate lal2 = LocalDate.of(1983, 06, 11);
		basePerson2.setDob(lal2);
		
		
		GrandParent grandParent = new GrandParent(basePerson);
		Parent parent = new Parent(basePerson1);
		Child child = new Child(new Parent(new GrandParent(basePerson2)));
		
		
		child.print();
		
		
		
		

	}

}
