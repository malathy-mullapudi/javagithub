import java.util.ArrayDeque;
import java.util.Deque;

public class DqExample {

	public static void main(String[] args) {
		Deque<Integer> dq= new ArrayDeque<>();
		
		dq.add(23);
		dq.add(1);
		dq.add(8);
		dq.addLast(4);
		dq.addFirst(5);
		System.out.println(dq);
		System.out.println("the poll number:"+ dq.poll());
		System.out.println(dq);
	}

}
