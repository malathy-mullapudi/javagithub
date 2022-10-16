package Basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDeserial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
		Student s1 = new Student(101, "Sruthik");
		Student s2 = new Student(102, "Thanish");
		FileOutputStream fout = new FileOutputStream("C:\\file.txt\\codeDecode.ser");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(s1);
		oout.writeObject(s2);
		oout.flush();
		oout.close();
		} catch(Exception e) {
		System.out.println("byte stream worked");
		}
	}
}
