package assignment4;

//Create class Student with various data members and create and display records of 5 students.
class Student
{
	String name;
	int marks;
	char section;
	String branch;
	Student(String name,int marks,char section,String branch){
		this.name=name;
		this.marks=marks;
		this.section=section;
		this.branch=branch;
	}
}
public class Ass_part2 {
	public static void main(String s[]){
		Student students[] = new Student[10];
		students[0] = new Student("Suresh",45,'A',"CSE");
		students[1] = new Student("Mahesh",59,'B',"ENTC");
		students[2] = new Student("Rohit",83,'A',"CSE");
		students[3] = new Student("Siddhesh",98,'B',"ENTC");
		students[4] = new Student("Yashraj",88,'D',"MECH");
		for(int i = 0; i < 5; i++)
		{
			System.out.println( students[i].name + " in section " + students[i].section + " got " + students[i].marks + " marks."+students[i].branch+"branch" );
		}
	}
}
	

