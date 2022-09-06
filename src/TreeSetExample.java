import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();//treeset class maintains ascending order
		 
		tree.add("kamal");
		tree.add("faraan");
		tree.add("nirupam");
		tree.add("kamal");
		tree.add("madhur");
		System.out.println(tree);
		
		System.out.println(tree.higher("faraan"));
		
		Iterator<String> i= tree.descendingIterator(); //method used :iterator descending iterator
		while(i.hasNext()) {
			
		
		System.out.println(i.next());
		}
	}

}
