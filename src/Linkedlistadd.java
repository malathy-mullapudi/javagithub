import java.util.LinkedList;

public class Linkedlistadd {

	public static void main(String[] args) {
LinkedList<String> ln = new LinkedList<String>();
		
		ln.add("system");
		ln.add("cpu");
		ln.add("keyboard");
		ln.add("2");
		
		System.out.println("The linked list is:"+ln);

		ln.add("power");
		ln.add("speakers");
		ln.add(0,"printer");
		System.out.println("The elements added in the last are:"+ln);
		System.out.println("The last element is:"+ln.getLast());
		System.out.println("The first element is:"+ln.get(3));
	}

}
