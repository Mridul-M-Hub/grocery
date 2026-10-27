package HospitalManagementSystem;

abstract class Person {
	//variables
	private String name;
	private int id;
	private int age;
	private String mob_num;
	private String gender;
	
	
	//constructor
	Person(){
		
	}
	Person (String name,int id,int age,String mob_num,String gender){
		this.name = name;
		this.id = id;
		this.age = age;
		this.mob_num = mob_num;
		this.gender = gender;
		
	}
	//getters and setters
	public String getName() { // name
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() { //id
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {// age
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMob_num() { // number
		return mob_num;
	}
	public void setMob_num(String mob_num) {
		this.mob_num = mob_num;
	}
	public String getGender() { // gender
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//methods
	abstract void readDetails();
	abstract void displayDetails();;
}
