import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatingArray {

	public static void main(String[] args) {
	 ArrayList<String> names = new ArrayList<>();
	 names.add("malathy");
	 names.add("Ruthvik");
	 names.add("Darsh");
	 names.add("Ruthvik");
	 names.add("Darsh");
	 
	Set<String> s = new HashSet<>(); 
	 
	for(String name: names) {
	
		if(s.add(name)==false)
		
		System.out.println(name);
	}
		
	 
	}

}
