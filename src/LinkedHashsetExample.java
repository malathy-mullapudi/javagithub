import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> Ch= new LinkedHashSet<>();
		Ch.add("Mal");
		Ch.add(null);
		Ch.add("karan");
		System.out.println("print Ch elements:" + Ch);
		
		System.out.println(Ch.remove(null));
		System.out.println("After removing print Ch:" +Ch);
		System.out.println(Ch.remove("frame"));
		System.out.println("frame is not present");
		
		

	}

}
