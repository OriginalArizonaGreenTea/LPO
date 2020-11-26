public class Test {
	public static void main(String[] args){
		Person roberto = new Person("Roberto", "Torpedine");
		Person anna = new Person("Anna", "Bianchi");
		
		assert roberto.name() != null;
        assert roberto.surname() != null;
		assert anna.name() != null;
        assert anna.surname() != null;
		assert roberto != anna;
        assert roberto.socialSN() != anna.socialSN();

        roberto.isSingle();
        anna.isSingle();
        Person.join(roberto,anna);
        System.out.println("ciao");
	}
}