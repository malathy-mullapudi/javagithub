package ProducerAndConsumer;

public class Student extends Thread {
	private Vtalent vtalent;
	private int number;
	
	public Student(Vtalent v, int number) {
		vtalent= v;
		this.number = number;
	}
	public void run() {
		int value =0;
		for(int i =0; i<10 ; i++) {
			value = vtalent.get();
			System.out.println("Consumed"+this.number +"got:"+value);
			
		}
	}

}
