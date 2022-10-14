package StringPractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "KEEP";
		String s2 = "PEEK";
 
		//convert the strings to lowercase
//		s1= s1.toLowerCase();					//keep
//		s2= s2.toLowerCase();					//peek
//		
		//compare length of two strings
		if(s1.length()==s2.length()) {
			
			//convert them to char array
			
			char[] arr1=s1.toCharArray();			//["k","e","e","p"]
			char[] arr2=s2.toCharArray();			//["p","e","e","k"]
			
			//sort the char array
			
			  Arrays.sort(arr1);						//["e","e","k","p"]
			  Arrays.sort(arr2);						//["e","e","k","p"]
			
			//by using equals method
			  
			  boolean result = Arrays.equals(arr1, arr2);
			  
			  if(result) {
				  System.out.println(s1  + " and " + s2 + " are anagrams ");
			  }else {
				  System.out.println(s1 + " and " +s2 + " are not anagrams ");
			  }
			
		}
	}

}
