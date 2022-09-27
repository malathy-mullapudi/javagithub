package InheritanceConcepts;

public class Child extends Parent {
	public void print(int num) {
		int i = 1;
		while(i <= num) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public final void SayHi() {
		System.out.println("Hi....");
	}
}
