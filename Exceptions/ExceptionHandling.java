// Custom exception for invalid age
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Base class Father
class Father {
    int age;

    // Constructor to initialize age
    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.age = age;
    }
}

// Derived class Son
class Son extends Father {
    int sonAge;

    // Constructor to initialize father's and son's age
    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge); // Call Father's constructor
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age!");
        }
        this.sonAge = sonAge;
    }
}

// Main class to demonstrate exception handling
public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            // Create Father and Son objects
            Father father = new Father(45);
            Son son = new Son(45, 20);

            // Display ages
            System.out.println("Father's age: " + father.age);
            System.out.println("Son's age: " + son.sonAge);
        } 
	  catch (WrongAgeException e) {
            // Handle exceptions
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create objects with invalid ages
            Son invalidSon = new Son(30, 35); // Should throw an exception
        } 
	  catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a father with invalid age
            Father invalidFather = new Father(-10); // Should throw an exception
        } 
	  catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
