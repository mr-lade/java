package assignment5;

//Write a constructor in the Car class that initializes the brand class field with the string “Ford”.Call the getBrand() method in the main method of the Sample class and store the value of the brand in a variable, and print the value.

class Car {
	String brand;
	public Car(){
		this.brand ="Ford";
	}
	public String getBrand() {
		return brand;
	}
	void run() {
		System.out.println("Car is running...");
	}
}
public class Ass_Part2 {
	public static void main(String[] args) {
		Car ford = new Car();
		String brand = ford.getBrand();
		System.out.println(brand);
		}
}
