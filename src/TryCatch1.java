import java.util.ArrayList;



public class TryCatch1 {

	public static void main(String[] args) {
		try {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add(4, "mery");
		arr.add("jenny");
		System.out.println(arr);
		}
		catch(Exception e) {
			System.out.println("exception takes place");
		}
		finally {
			System.out.println("finally exception skipped");
		}
		
	}

}
