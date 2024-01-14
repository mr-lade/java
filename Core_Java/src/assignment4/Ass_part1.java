package assignment4;

//Write a program to find factorial using the static method.

public class Ass_part1 {
	static int factorial(int n)               //a static method is a method that belongs to a class rather than an instance of the class.
	{
		if (n == 0)
		return 1;
		return n * factorial(n - 1);
	}
	public static void main(String[] args)
	{
		int num = 5;
		System.out.println("Factorial of " + num
		+ " is " + factorial(5));
	}
}
