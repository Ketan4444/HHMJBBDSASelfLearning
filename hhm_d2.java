import java.util.*;

public class hhm_d2
{

    public static void understandingIfElse()
    {
        int n = 10;
        if(n % 2 == 0)
        System.out.println(n + " is even.");
        else
        System.out.println(n + " is odd.");


        System.out.println("Understanding if else is fun");
    }


    public static void understandingIfElseIf()
    {
        int n1 = 10;
        int n2 = 10;

        if(n1 == n2)
        System.out.println(n1 + " is equal to " + n2);
        else
        {
            if(n1 > n2)
            System.out.println(n1 + " is greater than " + n2);
            else
            System.out.println(n1 + " is smaller than " + n2);
        }
    }

    public static void understandingifelseStack()
    {
        int n1 = 10;
        int n2 = 12;

        if(n1 == n2)
        System.out.println(n1 + " is equal to " + n2);
        else if(n1 > n2)
        System.out.println(n1 + " is greater than " + n2);
        else
        System.out.println(n1 + " is smaller than " + n2);
    }

    public static void gradingSystem(int marks)
    {
        if(marks > 90)
        System.out.println("excellent");
        else if(marks > 80)
        System.out.println("good");
        else if(marks > 70)
        System.out.println("fair");
        else if(marks > 60)
        System.out.println("meets expectations");
        else
        System.out.println("below par");
    }
    public static void main(String[] args)
    {
            // understandingIfElse();
            // understandingIfElseIf();
            // understandingifelseStack();

            gradingSystem(78);
    }
}