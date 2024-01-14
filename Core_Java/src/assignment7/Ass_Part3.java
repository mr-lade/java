package assignment7;

//Create a class named 'Member' having the following Data members
//
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 – Salary
//
//
//It also has a method named 'printDetails' which prints the details of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.(Use Method overriding)

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printdetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber,
                   String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Ass_Part3 {
    public static void main(String[] args) {
        Employee employee = new Employee("Sachin", 20, "1234", "Pune", 256.5, "IT");
        Manager manager = new Manager("Ankit", 30, "12345", "India", 9876.8, "Computer Science");

        // Printing details of employee and manager
        employee.printdetails();
        manager.printdetails();
    }
}
