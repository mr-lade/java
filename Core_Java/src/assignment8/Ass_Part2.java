package assignment8;

//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.

abstract class Marks {
    abstract double getPercentage();
}

// class A
class A extends Marks {
    private float sub1, sub2, sub3;

    public A(float s1, float s2, float s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 300.0 * 100;
    }
}

// class B
class B extends Marks {
    private float sub1, sub2, sub3, sub4;

    public B(float s1, float s2, float s3, float s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 400.0 * 100;
    }
}

public class Ass_Part2 {
    public static void main(String[] args) {
        A a = new A(89, 55, 66); // creating object of class A
        B b = new B(56, 89, 98, 90); // creating object of class B

        double p1 = a.getPercentage(); // object of class A calling its getPercentage() function
        double p2 = b.getPercentage(); // object of class B calling its getPercentage() function

        System.out.println("Percentage of student A: " + p1);
        System.out.println("Percentage of student B: " + p2);
    }
}
