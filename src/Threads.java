

public class Threads implements Runnable
{
  public void run() //overriding run method of runnable class
  {
	  System.out.println("running state");
  }
  public static void main(String[] args) {
	  Threads t = new Threads();
	  Thread th = new Thread(t);// creating object for 
	  //thread class and proving the constructor of Threads class.
	  th.start();//invoke the thread by calling run method
  }
}
