package HospitalManagementSystem;

import java.util.Scanner;

public class Doctor extends Person {
	//variables
	String specialization ;
	int consultationFee ;
	
	//varS to store values from method readDetails
	String spec;
	int Fee ;
	
	//constructors
	
	Doctor (String name,int id,int age,String mob_num ,String gender,String specialization,int consultationFee){
		super(name,id,age,mob_num,gender);
		this.specialization = specialization;
		this.consultationFee =consultationFee;
	}
	Doctor(){
		//created for avoid values passing while creating obJ of patient
	}
	
	//methods
	@Override
	void readDetails() { //method to read details
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Doctors's name : ");
		setName(sc.next()); //used set for private varS
		System.out.println("Enter Id : ");
		setId(sc.nextInt());
		System.out.println("Enter Specialization : ");
		spec = sc.next();
		System.out.println("Enter consultationFee : ");
		Fee = sc.nextInt();
		System.out.println("Enter Age : ");
		setAge(sc.nextInt());
		System.out.println("Enter mobile number : ");
		setMob_num(sc.next());
	}
	
	@Override
	void displayDetails() { //method to display details
		System.out.println("Name : " + getName());
		System.out.println("Id : " + getId());
		System.out.println("Specialization is : " + spec);
		System.out.println("ConsultationFee : " + Fee);
		System.err.println("Age : " + getAge());
		System.out.println("Mobile number : " + getMob_num());
		System.out.println("Doctor added successfully.");
	}

}
