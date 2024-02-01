package javapractice;

public class Student {
	int total;
	String name;
	int rollno;
	/*Constructor:is to perform initialization of object
	
	In Java, a constructor is a special method that has the same name as the class and is used to initialize the object's state. 
	Constructors are called automatically when an object is created using the new keyword.*/
 
	/*Default Constructor:

		If a class does not have any explicit constructor, Java provides a default constructor with no parameters.
		This default constructor initializes instance variables to default values (e.g., 0 for numeric types, null for reference types).*/
		
		public class MyClass {
	    // Default constructor is implicitly provided if not explicitly defined
		}
	
		//Parameterized Constructor:

			/*A parameterized constructor is one that takes parameters for initializing the instance variables of the object.
			It provides a way to customize the initialization of objects.*/
			
			Student(int total,String name,int rollno) {
		// TODO Auto-generated constructor stub
this.total	=total;
this.name=name;
this.rollno=rollno;
	}
	
// Method to display the values of instance variables

		public void info(){
		System.out.println("Total"   + total);
		System.out.println("Name"    + name);
		System.out.println("Rollno"  + rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an instance of AllDataTypesConstructorExample with different data types
Student S1=new Student(20,"Swathi",201);
Student S2=new Student(20,"Shinny",202);
Student S3=new Student(20,"Thanvik",203);

//Calling the method to display the values of instance variables
S1.info();
S2.info();
S3.info();
	}


}


