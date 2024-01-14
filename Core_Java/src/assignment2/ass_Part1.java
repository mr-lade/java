package assignment2;

//Write a java program to create a class Student to accept Your family Details such as your name, age, address, city, and postal code and display all details.

public class ass_Part1 {
    String name;
    String address;
    String city;
    int age;
    public ass_Part1(String name, String address,String city,int age)  //constructor is a special method that is used to initialize objects of a class
    {
        this.name = name;                                              //If a constructor parameter has the same name as an instance variable, you can use this to differentiate between them.
        this.address = address;
        this.city = city;
        this.age = age;
    }
   
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public String getcity()
    {
        
      return city;
    }
    public int getage()
    {
        return age;
    }
     
    public static void main(String[] args)
    {
        ass_Part1 s1 = new ass_Part1("Rohit","Bhandup","Mumbai",20);
        
        System.out.println(s1.getname());
        System.out.println(s1.getaddress());
        System.out.println(s1.getcity());
        System.out.println(s1.getage());
    }
}
