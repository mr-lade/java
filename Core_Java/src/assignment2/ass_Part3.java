package assignment2;
import java.util.Scanner;

//Write a Java Program to check whether the input character is vowel or consonant

public class ass_Part3 {
	public static void main(String args[]){
	      System.out.println("Enter a character :");
	      Scanner sc = new Scanner(System.in);      //The Scanner class in Java is commonly used to take input from the user through the console.
	      char ch = sc.next().charAt(0);
	      sc.close();
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	      {
	         System.out.println("Given character is an vowel");
	      }
	      else{
	         System.out.println("Given character is a consonant");
	      }
	   }
}
