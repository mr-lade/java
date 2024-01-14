package assignment6;

//Create any class and make use of constructor overloading, copy constructor , three uses of this keyword in it
	//1)refer to current
	//2)this.getbrand() 
	//3)chaining of constructor

public class Ass_Part1{
    private String brand;
    private String model;
    private int year;

    // Constructor Overloading
    public Ass_Part1() {
        // Default constructor
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public Ass_Part1(String brand, String model, int year) {
        // Parameterized constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Copy Constructor
    public Ass_Part1(Ass_Part1 otherCar) {
        // Copy constructor
        this.brand = otherCar.brand;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }

    // Use of "this" to refer to the current instance
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }

    // Use of "this" to access a method
    public String getBrand() {
        return this.brand;
    }

    // Chaining of Constructors
    public Ass_Part1(String brand) {
        // Chaining to the parameterized constructor
        this(brand, "Unknown", 0);
    }

    public static void main(String[] args) {
        // Example of constructor overloading
        Ass_Part1 car1 = new Ass_Part1(); // Default constructor
        Ass_Part1 car2 = new Ass_Part1("Toyota", "Camry", 2022); // Parameterized constructor

        // Example of copy constructor
        Ass_Part1 car3 = new Ass_Part1(car2);
        car3.displayDetails();
        // Example of "this" keyword usage
        car1.displayDetails();
        System.out.println("Brand of car2: " + car2.getBrand());

        // Chaining of Constructors
        Ass_Part1 car4 = new Ass_Part1("Honda");
        car4.displayDetails();
    }
}
