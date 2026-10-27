package HospitalManagementSystem;

import java.util.Scanner;

public class Appointment {
	Scanner sc = new Scanner(System.in);
 
	Appointment(){ //for obJ creation without para_values.
		
	}
	
	void bookAppointment() {
		System.out.println("--- Appointment booking ---");
		
//		Patient pt = new Patient("", 0, 0, "", ""); //giving values null at first ,then updating with 
//											//getters(get) and setters(set) in read&display methods.
//		Doctor dt = new Doctor("", 0, 0, "", "", "", 0);
		System.out.println("Enter Appointment Id : ");
		String appointmentId = sc.next();
		System.out.println("Enter the date for Appointment : ");
		String date = sc.next();
		System.out.println("Appointment Id is : " + appointmentId + "\tDate : " + date);
		
		Patient pt = new Patient();
		System.out.println("---Register Doctor details---");
		pt.readDetails();
		System.out.println("---Register Doctor details---");
		Doctor dt = new Doctor();
		dt.readDetails();
		System.out.println("Appointment booking on " +date + " is completed." );
		pt.displayDetails();
		dt.displayDetails();
		
	}
	
	void cancelAppointment() {
		System.out.println("--- Cancelling Appointment---");
		
	}
}
