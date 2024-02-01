package javapractice;

/*Constructor Overloading:
 * 
Constructor overloading is the concept of defining multiple constructors within the same class with different parameter lists.
 Each constructor can have a different set of parameters. The constructors are distinguished based on the number or types of parameters they accept. 
 This allows for flexibility when creating objects of the class.*/

public class Class {
    int value;

    // Constructor with no parameters
    public Class() {
        this.value = 0;
    }

    // Constructor with one parameter
    public Class(int value) {
        this.value = value;
    }

    // Constructor with two parameters
    public Class(int value1, int value2) {
        this.value = value1 + value2;
    }

    // Other methods can be defined here
}

//Calling Superclass Constructor (super):

/*In a subclass, the super() keyword is used to call the constructor of the superclass.
This is done implicitly if not explicitly provided.*/

class Animal {
    String species;

    // Constructor of the superclass
    public Animal(String species) {
        this.species = species;
    }
}

class Dog extends Animal {
    String breed;

    // Constructor of the subclass
    public Dog(String species, String breed) {
        super(species); // Calls the constructor of the superclass
        this.breed = breed;
    }
}