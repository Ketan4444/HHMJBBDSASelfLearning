import java.util.*;
public class hhm_d3 {

    public static void understandingInput()
    {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();

        // for(int i = 1; i <= n; i++)
        // {
        //     System.out.println(i);
        // }

        // String name = scn.nextLine();

        // System.out.println("Hello Jii " + name);

       
        String name = scn.nextLine();
        int n = scn.nextInt();

        System.out.println("Hello Jii " + name + " you entered " + n);
    }

    public static boolean isPrime(int num)
    {
        boolean isPrime = true;

        for(int div = 2; div * div <= num; div++)
        {
            if(num % div == 0)
            {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void printPrime()
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 1 ; i <= t; i++)
        {
            int num = scn.nextInt();
            if(isPrime(num))
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }
    public static void main(String[] args)
    {
        //understandingInput();
        printPrime();

    }
    
}
