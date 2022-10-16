package Basics;

import java.util.Scanner;

public class BookAnAppointment {
   static boolean available = true;
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		String Name = input.nextLine();
		System.out.println("please Enter the day to Schedule: ");
		String Day = input.nextLine();
	
		try {
			if(available!= true) {
			System.out.println("Appointment cancelled");
			}else {
				System.out.println("Slot Booked and please attend on the day");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
