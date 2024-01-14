package assignment3;

//Write a Java program to compare a given string to another string, ignoring case considerations and sort it

public class ass_Part4 {
	public static void main(String[] args) {
	    String names[] = {"Python", "Java", "C", "JavaScript", "C++","python","c","HTML"};
	 
	    for(int i=0; i<names.length-1; i++){
	      for(int j=0; j<names.length-1-i; j++){
	        String str1 = names[j].toLowerCase();
	        String str2 = names[j+1].toLowerCase();
	        if(str1.compareTo(str2)>0){
	          String temp = names[j];
	          names[j] = names[j+1];
	          names[j+1] = temp;
	        }
	 
	      }
	    }
	    for(int i=0; i<names.length; i++){
	      System.out.print(names[i]+" ");
	    }
	  }
}
