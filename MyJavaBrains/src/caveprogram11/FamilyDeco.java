package caveprogram11;

public class FamilyDeco implements Person{

	Person  person;
    public FamilyDeco(Person person) {
		this.person = person;
	}

    @Override
	public void print() {
		person.print();
	}

	
}
