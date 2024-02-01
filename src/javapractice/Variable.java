package javapractice;

public class Variable {
	
	static int count=0;
	//instance variable
    int instanceCount;

public Variable() {
	// Increment both static and instance counts on each object creation
	count++;
instanceCount++;
}

//method to display
public static void details() {
	System.out.println("count :" +count);
	// Cannot access instanceCount directly in a static method; will result in a compilation error
    // System.out.println("Instance Count: " + instanceCount);
}


	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Variable V1=new Variable();
    // Calling the static method to increment the static variable
   
	V1.details();
	}



}
