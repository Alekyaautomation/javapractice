package javapractice;

public class Car {
	//Instance variable can declare within class but outside of any method , constructor or block
	int year;
	String brand;
	String name;
	double price;
	
	
	// Constructor
    public Car(String brand, int year, double price,String name) {
        // Initializing instance variables in the constructor
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.name= name;
    }
    
	// Other methods can access and modify instance variables
    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("name: " + name);
        
       
    }
    
    public static void main(String[] args) {
    	// // Creating an instance of MyClass with a constructor
    	 Car car1 = new Car("Toyota", 2020, 25000.0, "Corolla");
    	 Car car2= new Car("Honda",2021,50000.0,"Tata");
         // Calling the method that uses instance variables

         car1.details();
         car2.details();
}
}

