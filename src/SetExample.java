import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<>();
		
		set.add("Ravi");
		set.add("poonam");
		set.add("navya");
		set.add("poonam");
		set.add("shravya");
		System.out.println(set);
		
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
