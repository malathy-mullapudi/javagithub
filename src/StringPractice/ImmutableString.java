package StringPractice;

//WAP to prove that strings are immutable

public class ImmutableString {

	public static void main(String[] args) {
		String Name = "Malathy";
		String surname = "Mandava";
		String Name2 = "Malathy";
		
		System.out.println(Name);
		Name2 = surname.concat(Name);
		System.out.println( Name2);
		Name = Name.concat(" Mullapudi");
		System.out.println(Name);
	}

}
