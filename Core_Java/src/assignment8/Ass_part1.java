package assignment8;

//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

public class Ass_part1 {
	public static void main(String[] args) {
		Area a = new Area(); //creating object of Area and calling each method by object of area
		a.RectangleArea(5f, 7f);//Two parameter passed
		a.SquareArea(5f);// one parameter passed
		a.CircleArea(4);// one parameter passed
	}
}

abstract class Shape{ //abstract class as shape with three different methods abstract void RectangleArea(float length , float breadth); //a) rectangle area
	abstract void SquareArea(float radius);//b) square area
	abstract void RectangleArea(float length, float breadth);
	abstract void CircleArea(float side);//c) circle area
}

class Area extends Shape{ // inherit area properties into shape class
	double Area=0;
	@Override
	void RectangleArea(float length , float breadth){
		Area = length * breadth;
		System.out.println("Area of rectangle is: "+Area);
	}
	@Override 
	void SquareArea(float Side){
		Area = Side * Side;
		System.out.println("Area of Square is: "+Area);
	}
	@Override
	void CircleArea(float radius){
		Area = (radius * radius)*3.14;
		System.out.println("Area of Circle is: "+Area);
	}
}
