import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("park");
		list.add("theater");
		list.add("market");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
