package InheritanceConcepts;

public class PrintParent {
	
	private void Print() {
		System.out.println("Im from parent");
	}

	public static void main(String[] args) {
	    PrintParent pp = new PrintParent();
		pp.Print();
		PrintChild pc = new PrintChild();
		pc.done();
		PrintParent ppc = new PrintChild();
		ppc.Print();
	}

}
