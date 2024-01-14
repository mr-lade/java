package assignment3;

import java.util.Scanner;

//Create an array of integers and find the largest and second largest among them.

public class ass_Part1 {
	public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;   
        System.out.println("Enter the size of the array");
        n=sc.nextInt();   
        
        int arr[]=new int[n];    
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++)     
       {
           arr[i]=sc.nextInt();
       }
       sc.close();
       int lar1=arr[0];   
       int lar2=arr[1];  
       
      if(lar1<lar2)
       {
           int temp=lar1;
           lar1=lar2;
           lar2=temp;
       }
               
       for(int i=2;i<n;i++)
       {
           if (arr[i] > lar1)
			{
				lar2 = lar1;
				lar1 = arr[i];
			}
			else if (arr[i] > lar2 && arr[i] != lar1)
			{
				lar2 = arr[i];
			}
       }
       System.out.println("First Largest"+lar1); 
       System.out.println("Second Largest "+lar2); 
       
      
   }
}
