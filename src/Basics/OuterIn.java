package Basics;

class OuterTeam{
	int data =30;
	
	class InnerTeam{
		String name = "Suhas";
		
	}

public class OuterIn {

	public static void main(String[] args) {
		
		OuterTeam ot = new OuterTeam();
		OuterTeam.InnerTeam it = ot.new InnerTeam();
		System.out.println(ot.data+" "+it.name);
	}

}
}
