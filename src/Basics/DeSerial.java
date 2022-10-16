package Basics;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerial {

	public static void main(String[] args) {
		try {
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:\\file.txt\\codeDecode.ser"));
		
		Student ss1 = (Student) oin.readObject();
		//Student ss2 = (Student) oin.readObject();
		
		
		
		System.out.println(ss1.id+ " "+ ss1.Name);
		//System.out.println(ss2.id+" "+ss2.Name);
		oin.close();
		
		}catch(Exception e) {
		
		System.out.println(e);
		}
	}

}
