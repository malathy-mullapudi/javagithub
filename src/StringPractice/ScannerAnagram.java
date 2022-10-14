package StringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the First String: ");
		String s1 = input.nextLine();
		System.out.println("Enter the Second String: ");
		String s2 = input.nextLine();
		
		if(s1.length()==s2.length());
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean result = Arrays.equals(arr1, arr2);
		
		if(result) {
			System.out.println(s1+ " and "+s2+ " are ANAGRAMS");
		}else {
			System.out.println(s1+ " and "+s2+ " are NOT ANAGRAMS");
		}

	}

}
