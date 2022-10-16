package Basics;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String Name;
	
	public Student(int id,String Name) {
	 
		this.id= id;
		this.Name = Name;
	}

}
