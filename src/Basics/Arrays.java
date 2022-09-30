package Basics;
//Program on sorting and reversing using Collections
import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
   
   public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		
	    str.add("shiny");
	    str.add("Kranthi");
	    str.add("Maruthi");
	    str.add("Anu");
	    System.out.println("Elements before sorting: " +str);
	    Collections.sort(str);
	    System.out.println("Elements after sorting: "  +str);
	    Collections.reverse(str);
	    System.out.println("After Reversing: "  +str);
   }
}
				
   


