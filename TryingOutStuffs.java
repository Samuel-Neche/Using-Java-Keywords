package tryingoutstuffs;

import java.util.Scanner;

public class TryingOutStuffs {

    public static final double PI = 3.142;
    public static int numbe = 0;

    public static void main(String[] args) {

        //The method for scanning inputs    
        Scanner in = new Scanner(System.in);

        //Defining a constant like pi=3.142, it should be outside the main method, because it is a constant
        //final double pi = 3.142;
        // pi should also be capitalized as PI...
        System.out.println("The value of the constant pi = " + PI);

        //Defining variables and collecting inputs
        int a, b;
        System.out.println("\nEnter the value of a: ");
        a = in.nextInt();
        System.out.println("Enter value of b: ");
        b = in.nextInt();
        //processing c...
        double c = Math.pow(a, b);
        System.out.println("The value of " + a + "^" + b + " is ..." + c);

        //Trying if statement...
        if (c >= 8.0) {
            System.out.println("See, bros the value of " + c + " the is more than or equal to 8.0!");
        } else {
            System.out.println("Young man the value of " + c + " is less than 8");
        }

        //Trying arithmetic operators
        int number = 5;
        number = number + 3;
        number += 2;
        number -= 2;
        number /= 2;
        number %= 3;
        System.out.println("\nThe new value of number equals: "+number);
        //Check the other class for the result :)
        
        
        double no = 10E3;
        System.out.println(no);
    }

}
