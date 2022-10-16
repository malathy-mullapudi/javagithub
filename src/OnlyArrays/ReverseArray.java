package OnlyArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReverseArray {
	public void SerialDeserial() {
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("demo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject("This is Searialized");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
	
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("demo.txt"));

			Object ab = ois.readObject();
			
			System.out.println(ab);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = new int[]{1,3,4,5,2,9};
		System.out.println("original array:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
   System.out.println("reverse an array:");
       for(int i=a.length-1;i>=0;i--) {
    	   System.out.print(a[i]+" ");
       }
       
       
       ReverseArray ra = new ReverseArray();
       ra.SerialDeserial();
       
       
       Hi h = new Hi();
       Hello he = new Hello();
       Thread t = new Thread(h);
       he.start();
       t.start();
	}
	
	
	// another way to reverse using temp..l
	

}

//threads
class Hi implements Runnable{

	@Override
	public void run() {
		System.out.println("hI THREAD");
		
	}
	
}
class Hello extends Thread{

	
	public void run() {
		System.out.println("HELLO THREAD");
		
	}
	
}
