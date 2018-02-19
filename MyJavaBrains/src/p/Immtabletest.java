package p;

class Immtabletest1 {

	private final String name;
    Immtabletest1(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
}

class Immtabletest extends Immtabletest1{
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Immtabletest(String name) {
		super(name);
		setName(name);
	}
	
	public static void main(String[] args) {
		
		Immtabletest1 immtabletest1 = new Immtabletest1("mani");
		System.out.println(immtabletest1.getName());
		Immtabletest1 mutable = new Immtabletest("sona");
		System.out.println(mutable.getName());
		
		
	}
	
}