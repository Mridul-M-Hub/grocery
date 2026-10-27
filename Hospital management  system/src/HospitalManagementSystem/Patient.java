package HospitalManagementSystem;

import java.util.Scanner;

public class Patient extends Person { 
	
	//constructors
	Patient() { //created for avoid values passing while creating obJ of patient
		
	}
	Patient (String name,int id,int age,String mob_num,String gender){
		super(name,id,age,mob_num,gender);
	}
	
	@Override
	void readDetails() { //method to read details
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient's name : ");
		setName(sc.next()); //taking values as null/0 at 1st and using set for  updating private varS
		System.out.println("Enter Id : ");
		setId(sc.nextInt());
		System.out.println("Enter Age : ");
		setAge(sc.nextInt());
		System.out.println("Enter mobile number : ");
		setMob_num(sc.next());
	}
	
	@Override
	void displayDetails() { //method to display details
		System.out.println("Name : " + getName());//updating values from null/0 to userData using 'get' for printing private varS
		System.out.println("Id : " + getId());
		System.err.println("Age : " + getAge());
		System.out.println("Mobile number : " + getMob_num());
		System.out.println("Patient registraton successful.");
	}
	
	
}
