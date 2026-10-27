package HospitalManagementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== HOSPITAL MANAGEMENT SYSTEM ========\n");
		
		System.out.println("1  Register patient.");
		System.out.println("2  Add Doctor.");
		System.out.println("3  Book Appointment.");
		System.out.println("4  Cancel Appointment .");
		System.out.println("5  Search Patient.");
		System.out.println("6  Search Doctor.");
		System.out.println("7  Generate Bill.");
		System.out.println("8  Display All Patients .");
		System.out.println("9  Display All Doctors.");
		System.out.println("10 Display All Appointments.");
		System.out.println("11 Reports.");
		System.out.println("12 Exit.\n");
		
		System.out.println("============================================\n");
		
		System.out.println("Enter your choice : (1-12)");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : 		//register patient
			Patient pt = new Patient();
			System.out.println("---Register Patient details---");
			pt.readDetails();
			pt.displayDetails();
			break;
		case 2 : 		//add doctor
			Doctor dc = new Doctor();
			System.out.println("---Register Doctor details---");
			dc.readDetails();
			dc.displayDetails();
			break;
		case 3 : 		//book appointment
			Appointment ap = new Appointment();
			ap.bookAppointment();
			break;
			
		}
		
	}
}
