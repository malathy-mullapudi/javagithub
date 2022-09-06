public class PracticeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "hi";
String str2 ="  Malathy";
 
 
String str3 = str1.concat(str2);
System.out.println("the concatinated string is: " + str3);
System.out.println("The Length of str2 is:" +str2.length());
System.out.println("The index of str2 for letter t is:" +str2.indexOf('t'));
System.out.println("The Contain method:" +str1.contains(str3));
System.out.println("Converting to UpperCase:" +str3.toUpperCase());
System.out.println("trimming str2:" +str2 .trim());
}
}