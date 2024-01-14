package assignment4;

import java.util.Scanner;

// Create a student database by making use of some static and non-static data members and member functions

public class Ass_part3 {
    // Static variables for college and university information
    static String clg_name = "MIT Academy of Engineering";
    static String uni = "Savitribai Phule Pune University";

    // Non-static variables for student information
    String name;
    int roll_no;
    String branch;
    int m1, m2, m3;

    // Static method to display general information
    static void generalInfo() {
        System.out.println("-----------WELCOME-----------");
        System.out.println(clg_name);
        System.out.println(uni);
    }

    // Method to get data for a student
    void getData() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your roll no: ");
        roll_no = sc.nextInt();

        // Consume the newline character after reading the integer
        sc.nextLine();

        System.out.println("Enter your branch:");
        branch = sc.nextLine();
        System.out.println("Enter your marks for the following subjects:-");
        System.out.println("English:");
        m1 = sc.nextInt();
        System.out.println("Maths:");
        m2 = sc.nextInt();
        System.out.println("Computer applications:");
        m3 = sc.nextInt();
        sc.close();
    }

    // Method to display student information
    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Branch: " + branch);
        float per = (m1 + m2 + m3) / 3.0f;  // Corrected data type to float
        System.out.println("Percentage secured: " + per + "%");
    }

    public static void main(String[] args) {
        // Calling the static method to display general information
        Ass_part3.generalInfo();

        // Creating an array of Ass_part3 objects
        Ass_part3[] obj = new Ass_part3[2];

        System.out.println("Database for 2 students...");
        for (int i = 0; i <= 2; i++) {
            obj[i] = new Ass_part3();
            obj[i].getData();
            obj[i].display();
        }
    }
}
