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

    public static void printPrimesInRange(int lo , int hi)
    {
        for(int i = lo; i <= hi; i++)
        {
            if(isPrime(i))
            System.out.println(i);
        }
    }

    public static void printFibonacci(int n)
    {
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++)
        {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void countDigits(int num)
    {
        int count = 0;

        while(num != 0)
        {
            num /= 10;
            count++;
        }

        System.out.println(count);
    }

    public static void printDigits(int num)
    {
        int temp = num;
        int pow = 1;

        while(temp >= 10)
        {
            pow *= 10;
            temp /= 10;
        }

        while(pow != 0)
        {
            int quo = num / pow;
            System.out.println(quo);
            num = num % pow;
            pow /= 10;
        }
    }

    public static void printInReverse(int num)
    {
        while(num != 0)
        {
            System.out.println(num % 10);
            num /= 10;
        }
    }

    public static void inverseOfNumber(int num)
    {
        int inv = 0;
        int count = 1;

        while(num != 0)
        {
            int place = num % 10;
            inv = inv + count * (int)Math.pow(10 , place - 1);
            num /= 10;
            count++;
        }
        System.out.println(inv);
    }

    public static void rotateANumber(int num , int k)
    {
        int nod = 0;
        int temp = num;
        while(temp != 0)
        {
            temp /= 10;
            nod++;
        }

        k = k % nod;
        if(k < 0)
        k += nod;

        int div = 1;
        int mul = 1;

        for(int i = 1 ; i <= nod; i++)
        {
            if(i <= k)
            div *= 10;
            else
            mul *= 10;
        }

        int quo = num / div;
        int rem = num % div;
        int ans = rem * mul + quo;
        System.out.println(ans);

    }

    public static void gcdAndLcm(int num1 , int num2)
    {
        int on1 = num1;
        int on2 = num2;

        while(num1 % num2 != 0)
        {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        System.out.println(num2);

        int lcm = (on1 * on2) / num2;
        System.out.println(lcm);
    }

    public static void primeFactorization(int num)
    {
        for(int div = 2 ; div * div <= num; div++)
        {
            while(num % div == 0)
            {
                System.out.println(div);
                num /= div;
            }
        }

        if(num > 1)
        System.out.println(num);
    }

    public static void pythaGoreanTriplet(int a , int b , int c)
    {
        if((a * a) == (b * b + c * c) || (b * b) == (a * a + c * c) || (c * c) == (a * a + b * b))
        System.out.println(true);
        else
        System.out.println(false);
    }

    public static void benjaminBulbs(int n)
    {
        for(int i = 1 ; i * i <= n; i++)
        {
            System.out.println(i * i);
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        //understandingInput();
        //printPrime();
        //printPrimesInRange(scn.nextInt(), scn.nextInt());
        //printFibonacci(scn.nextInt());
        //countDigits(scn.nextInt());
        //printDigits(scn.nextInt());
        //printInReverse(scn.nextInt());
        //inverseOfNumber(scn.nextInt());
        //rotateANumber(scn.nextInt(), scn.nextInt());
        //gcdAndLcm(scn.nextInt(), scn.nextInt());
        //primeFactorization(scn.nextInt());
        //pythaGoreanTriplet(scn.nextInt(), scn.nextInt(), scn.nextInt());
        benjaminBulbs(scn.nextInt());

    }
    
}
