package assignment3;

//Create an array of integers and sort it.

public class ass_Part2 {
	static void sortit(int []arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
            	if(arr[i]>arr[j]) {
            		int temp=arr[i];
            		arr[i]=arr[j];
            		arr[j]=temp;
            	}
            } 
        }
    }
    public static void main(String args[])
    {
        int []arr = {10, 7, 9, 2, 8,
                            3, 5, 4, 6, 1};
        int n = arr.length;
        sortit(arr, n);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
