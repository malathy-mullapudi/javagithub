package InheritanceConcepts;

public class GrandChildren extends Child {
	public void print(int num) {
		int i = 1;
		while(i <= num) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		super.SayHi();
	}
	
}
