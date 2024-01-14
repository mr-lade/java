package assignment9;

import java.util.Scanner;

//Create an interface named Account with different abstract methods in it and create different classes named as Saving, Current, Salary which implements account interface. If possible add more things in the program as per your logic.(Make use of reference object of interface also)

interface account {
    void amount();
    void type();
    void section();
}

class saving implements account {
    @Override
    public void amount() {
        System.out.println("Please enter rupee");
        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();
        sc.close(); // Closing Scanner
        if (rupee < 500) {
            System.out.println("Your rupee is:" + rupee);
            System.out.println("You are our saving type customer");
        }
    }

    @Override
    public void type() {
        System.out.println("Account is saving type");
    }

    @Override
    public void section() {
        System.out.println("Section a");
    }
}

class current implements account {
    @Override
    public void amount() {
        System.out.println("Please enter rupee");
        Scanner sc = new Scanner(System.in);

        // Check if there is input available before calling nextInt()
        if (sc.hasNextInt()) {
            int rupee = sc.nextInt();
            if (rupee >= 500 && rupee < 9000) {
                System.out.println("Your rupee is:" + rupee);
                System.out.println("You are our current type customer");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sc.close(); // Closing Scanner
     }

    @Override
    public void type() {
        System.out.println("Account is current type");
    }

    @Override
    public void section() {
        System.out.println("Section b");
    }
}

class salary implements account {
    @Override
    public void amount() {
        System.out.println("Please enter rupee");
        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();
        sc.close(); // Closing Scanner
        if (rupee > 9000) {
            System.out.println("Your rupee is:" + rupee);
            System.out.println("You are our salary type customer");
        }
    }

    @Override
    public void type() {
        System.out.println("Account is salary type");
    }

    @Override
    public void section() {
        System.out.println("Section c");
    }
}

public class Ass_Part1 {
    public static void main(String[] args) {
        saving s = new saving();
        s.amount();
        s.type();
        s.section();

        account a = new current();
        a.amount();
        a.type();
        a.section();

        account b = new salary();
        b.amount();
        b.type();
        b.section();
    }
}
