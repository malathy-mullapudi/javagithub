
public class Polymorphism {
	int c;
	public void add() {                                //method 1
		int a=12;                                      //declaring variables
		int b= 25;
		System.out.println("Sum of a and b:"+(a+b));    //printing the a and b
		}
	public void add( int a,int b) {                    //method 2 with parameters
		System.out.println(a+b);
		
	}
	public  int  add(int a,int b,int c) {               //method 3 with additional parameters
		return a+b+c;
		}
	  public static void main(String[] args) {
		  Polymorphism d=new Polymorphism ();          //creating an object
				  d.add() ;
		          d.add(12,25);
		          int ret  =d.add( 12,25,35);
		          System.out.println(ret );
	  }
}