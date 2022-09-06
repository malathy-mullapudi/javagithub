import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQExample {

	public static void main(String[] args) {
	
		 PriorityQueue<Integer> in = new PriorityQueue<>();
		 in.add(12);
		 in.add(34);
		 in.add(43);
		 
		 System.out.println(in);//printed all elements in an array
         
         System.out.println(in.element());//first element showed 12
         System.out.println(in.peek());//first element peeked 12
         Iterator<Integer> itr= in.iterator();
         while(itr.hasNext())
         {
        	 System.out.println(itr.next()); //listed 12 34 &43
         }
        
         
         in.poll();//retrived and removed 12 from this 	Q
        in.remove();//RETRIVed and removed the head of the Q 34
        in.poll();// retrived and removed 43
        System.out.println(in);//nothing in the list so printed null
        
	}

}
