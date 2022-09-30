package ProducerAndConsumer;

public class DatsolVtalent {

	public static void main(String[] args) {
		Vtalent v = new Vtalent();
		DatSol d1 = new DatSol(v ,1);
		Student s = new Student(v,1);
		d1.start();
         s.start();
	}

}
