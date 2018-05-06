package corejava;

//constructor is an instance method that usually has the same name.
//and is used for assigning a new default value
//constructor should be always non static.abstract
//static can not be a constructor
public class constructor {

	
	int age;
	int salary;
	int house;
	String name;
	
	constructor(){
		
		int age=47;
		int salary = 10000;
		int house=7;
		String name="John";
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		constructor x=new constructor();
		
	}

}
