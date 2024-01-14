package assignment2;

//Write a java program to accept value of n and display sum of 1 to n numbers

public class ass_Part4 {
	public static void main(String[] args)   
	{  
	int i, num = 10, sum = 0;  
	for(i = 1; i <= num; ++i)                                  //a for loop is used to iterate over a sequence of elements, such as an array, a collection, or to perform a specific set of statements a certain number of times
	{  
	sum = sum + i;  
	}  
	System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
	}
}
