package assignment9;

//Create  interfaces as Employee ,Programmer, Developer and Create class Engineer which implements Employee and make use of appropriate  abstract methods to implement it.(Make use of multiple inheritance)

interface employee{
	void type ();
}

interface programmer{
	void salary();
}
	
interface developer{ 
	void company();
}
	
class engineer implements employee,programmer,developer{
	public void type ()
	{
		System.out.println("grade a type employeer");
	}
	public void salary (){
		System.out.println("salary is 1 lakhs/month ");
	}
	public void company(){
		System.out.println("adobe ");
	}
}
public class Ass_Part2 {
	public static void main(String[] args) {
		engineer s= new engineer();
		s.type();
		s.salary();
		s.company();
	}
}
