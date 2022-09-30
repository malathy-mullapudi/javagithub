package ProducerAndConsumer;

public class DatSol extends Thread{
	private Vtalent vtalent;
	private int number;
	 public DatSol(Vtalent v,int number)
	 {
		 vtalent = v;
		 this.number = number;
	 }
	 public void run()
	 {
		 int value =0; 
		 for(int i=0;i<10;i++)
		 {
	      vtalent.put(i);
		 System.out.println("Datsol" +this.number +" put:"+i);
		 try 
		 {
			 sleep(200);
		 } 
		 catch (Exception ie){
			 
		 }
	  }
	 }
}

	 
