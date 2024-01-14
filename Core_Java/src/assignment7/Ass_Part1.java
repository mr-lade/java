package assignment7;

//Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

class Pclass{ //parent class
	public void pmethod(){
		System.out.println("This is parent class");
	}
}
class Cclass extends Pclass{ //child class
	public void cmethod(){
		System.out.println("This is child class");
	}
}

public class Ass_Part1 {
	public static void main(String[] args){
		Pclass m = new Pclass();// creating object of parent class
		Cclass n = new Cclass();//creating object of child class
		m.pmethod(); //method of parent class by object of parent class
		n.cmethod(); //method of child class by object of child class
		n.pmethod(); //method of parent class by object of child class
		}
}
