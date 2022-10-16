package Basics;

public class MultiThreads {

	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
		t1.start();
		t2.start();
	}

}
