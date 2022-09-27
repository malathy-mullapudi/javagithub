package InheritanceConcepts;

public class Program {
	public static void main(String[] args) {
		System.out.println("Application started");
		
		Parent parent = new Parent();
		parent.print(10);

		Child child = new Child();
	    child.print(10);
	
		Parent parentChild = new Child();	
		parentChild.print(10);
		
//	    Child childParent = new Parent();
		
		Parent parentGrandChild = new GrandChildren();
		parent.print(10);
		
		CallerLogic callereLogic = new CallerLogic();
		callereLogic.CallMe(parent);
		callereLogic.CallMe(child);
		callereLogic.CallMe(parentChild);
		callereLogic.CallMe(parentGrandChild);

		
	}
}
