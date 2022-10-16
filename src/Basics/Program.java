package Basics;

public class Program {

	public static void main(String[] args) {
		StaticDemo ad = new StaticDemo();
		StaticDemo ad1 = new StaticDemo();
		ad.id = 101;
		ad.Name = "Sri";
    	ad1.id = 102;
		ad1.Name = "Kranthi";
		
		System.out.println(ad.id +" "+ ad.Name);
		System.out.println(ad1.id+" "+ ad1.Name);
		
		ad.insertRecord(104,"Kesari");
		
		ad1.insertRecord(201, "karan");
		
		ad.display();
		
		ad1.display();
		
	}

}
