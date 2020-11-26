public class Person {
	private String name;
	private String surname;
	private long socialSN;
	private static long nextSSN;
	private Person spouse;

	public Person(String name, String surname){
		if (name == null | surname == null ) throw new NullPointerException();
		if (!name.matches("[A-Z][a-z]+( [A-Z][a-z]+)*")) throw new NullPointerException();
		if (!surname.matches("[A-Z][a-z]+( [A-Z][a-z]+)*")) throw new NullPointerException();
		this.name = name;
		this.surname = surname;
		this.socialSN = Person.nextSSN++;
		this.spouse = null;
	}
    public String name(){
        return this.name;
    }
    public String surname(){
        return this.surname;
    }
    public long socialSN(){
        return this.socialSN;
    }
	public Boolean isSingle(){
        return(this.spouse == null); 
	}
	public static void join(Person p1, Person p2){
		if (p1 == p2 | !p1.isSingle() | !p2.isSingle()) throw new NullPointerException();
		p1.spouse = p2;
		p2.spouse = p1;
	}
	public static void divorce(Person p1, Person p2){
		if (p1.spouse != p2 | p2.spouse != p1) throw new NullPointerException();
		p1.spouse = null;
		p2.spouse = null;
	}

}

