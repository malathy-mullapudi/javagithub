package InheritanceConcepts;
import java.util.LinkedList;

public class ProducerConsumer {
LinkedList<Integer> list = new LinkedList<Integer>();

public void Produce() {
	int value=0;
	while(true) {
        while(list.size()>0) {
        	System.out.println("produced value:" +value);
        	list.add(value);
        	value++;
        }
	}
}
public void Consume() {
	  while(true) {
		  while(list.size()==0) {
			  int value= list.removeFirst();
			  System.out.println("consumer:" +value);
			   }
	   }
	}

}

