package assignment5;

//Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating an object of Student class.

public class Ass_Part1 {
	String name;
	public Ass_Part1(String name){
		this.name=name;
	}
	public Ass_Part1(){
		this("Unknown");
	}
	public static void main(String args[]){
		Ass_Part1 s1=new Ass_Part1("sachin");
		System.out.println(s1.name);
		System.out.println();
	}
}
