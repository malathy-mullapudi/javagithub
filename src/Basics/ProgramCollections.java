package Basics;

public class ProgramCollections {

	public static void main(String[] args) {
		System.out.println("Application started");
		ArrayClass ac= new ArrayClass();
		ac.initializeArray();
		System.out.println( ac.getAvg());
		System.out.println(ac.getMax());
		System.out.println(ac.getMin());
		System.out.println(ac.getSum());
		System.out.println(ac.getEven());
		System.out.println(ac.getOdd());
		System.out.println(ac.getGreaterThen(50));
	}

}
