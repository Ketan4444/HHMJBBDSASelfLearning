import java.util.*;

public class hhm_d1
{

    // To print Z
    public static void printZ()
    {
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");
    }

    // To understand the variables
    public static void understandVariables()
    {
        int x = 10;
        int y = 30;

        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is " + sum);

        int prd = x * y;
        System.out.println("Product of " + x + " and " + y + " is " + prd);

        int quo = x / y;
        int quo_ = y / x;
        int rem = y % x;
        System.out.println(quo);
        System.out.println(quo_);
        System.out.println(rem);

        int expression = (x * y) / (x + y);
        System.out.println(expression);
    }
    public static void main(String[] args)
    {
        // System.out.print("Helo Jiii\n");
        // System.out.println("hello jii");

        // to print a triangle
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");


        // To print a triangle using single print statement

        //System.out.print("*\n**\n***\n****\n*****");

        //printZ();

        understandVariables();
    }
}