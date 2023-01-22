import java.util.*;
//FunWithNumber
class  Main
{
    int n;
    static String name;
    static int t=0;
    static Scanner sc=new Scanner(System.in);
    static int loop=0;
    Main()//This is default constructor
    {
        n=0;
    }

    void execution()//The starting of the program
    {
        System.out.println("\n\t *|||||*! WELCOME TO THE WORLD OF NUMBERS !*|||||*");
    }

    void name()//To know the user's name
    {
        System.out.println("What's your name User?");
        name=sc.nextLine();
    }

    void input()//To input the number
    {
        System.out.println("Enter the number");
        n=sc.nextInt();
    }

    void ask()
    {
        System.out.println("\nEnter 1 to continue");
        System.out.println("Enter 0 to exit\n");
        int k=sc.nextInt();
        if(k==1)
            this.caller();
        else if(k==0)
            System.exit(0);
        else
        {
            System.out.println("Error. Try Again");
            this.ask();
        }
    }
    void menu()
    {
        System.out.println("MAIN MENU:\n");
        String menu[]=
            {
                "Enter  1    to find out the factors of a number of your choice",
                "Enter  2    to check whether a number is palindrome",
                "Enter  3    to check whether a number is perfect",
                "Enter  4    to convert a number into its binary equivalent",
                "Enter  5    to print the fibonacci series upto 'n' number",
                "Enter  6    to check whether a number is automorphic",
                "Enter  7    to check whether a number is prime",
                "Enter  8    to check whether a number is buzz number",
                "Enter  9    to print twin-prime numbers upto n number",
                "Enter 10    to check whether a two-digit number is special",
                "Enter 11    to check whether a number is neon",
                "Enter 12    to check whether a number is armstrong",
                "Enter 13    to check whether a number is duck",
                "Enter 14    to check whether a number is unique",
                "Enter 15    to find the factorial of the given number"
            };
        for(int i=0;i<15;i++)
        {
            System.out.println(menu[i]);
        }
        System.out.println("\n||Make your choice here||");
        int a=sc.nextInt();
        if(a>=1 && a<=15)
        {
            this.input();
            this.run(a);
        }
        else
        {
            System.out.println("Error. Try again.");
            this.menu();
        }
    }

    void run(int a)
    {
        switch(a)
        {
            case 1:
            this.factors();
            break;
            case 2:
            this.palindrome();
            break;
            case 3:
            this.perfect();
            break;
            case 4:
            this.binary();
            break;
            case 5:
            this.fibonacci();
            break;
            case 6:
            this.automorphic();
            break;
            case 7:
            this.prime();
            break;
            case 8:
            this.buzznumber();
            break;
            case 9:
            this.twinprime();
            break;
            case 10:
            this.special();
            break;
            case 11:
            this.neon();
            break;
            case 12:
            this.armstrong();
            break;
            case 13:
            this.duck();
            break;
            case 14:
            this.unique();
            break;
            case 15:
            this.factorial();
            break;
        }
    }

    void glossary()
    {
        System.out.println("\nGLOSSARY:\n");
        String list[]=
            {                
                " 1: PALINDROME NUMBERS",
                " 2: PERFECT NUMBERS",
                " 3: BINARY NUMBERS",
                " 4: FIBONACCI",
                " 5: AUTOMORPHIC",
                " 6: PRIME NUMBERS",
                " 7: BUZZ NUMBERS",
                " 8: TWIN PRIME NUMBERS",
                " 9: SPECIAL NUMBERS",
                "10: NEON NUMBERS",
                "11: ARMSTRONG NUMBERS",
                "12: DUCK NUMBER",
                "13: UNIQUE NUMBER",
                "14: FACTORIAL\n"
            };
        for(int i=0;i<14;i++)
        {
            System.out.println(list[i]);
        }
        System.out.println("What do you want to know?");
        System.out.println("(enter the option number)");
        int b=sc.nextInt();
        if(b>=1 && b<=14)
        {
            switch(b)
            {
                case 1:
                System.out.println("\nThe numbers which look same in straight as well as reverse order");
                break;
                case 2:
                System.out.println("A number is said to be perfect if the sum of its factors other than itself is equal to the number");
                break;
                case 3:
                System.out.println("These are the hexadecimal numbers converted their binary equivalent i.e machine language");
                break;
                case 4:
                System.out.println("A special type of series starting with 0 and 1 in which the successive numbers are sum of the previous two numbers");
                break;
                case 5:
                System.out.println("Automorhic numbers is a number that is contained in the last digits of its square");
                break;
                case 6:
                System.out.println("The numbers which are divisible only by 1 and itself");
                break;
                case 7:
                System.out.println("These numbers either are divisible by 7 or contain 7 as their last digit");
                break;
                case 8:
                System.out.println("These are the successive prime numbers having a difference of 2");
                break;
                case 9:
                System.out.println("If the additive of the sum of digits and the product of the digits of a two-digit number is equal to the number itself then the number is special");
                break;
                case 10:
                System.out.println("The numbers which are equal to the sum of the digits of their square");
                break;
                case 11:
                System.out.println("The numbers which are equal to the sum of their digits' cube");
                break;
                case 12:
                System.out.println("The numbers which contain zero are known as duck numbers");
                break;
                case 13:
                System.out.println("The numbers in which none of the digits is repeated are known as unique numbers");
                break;
                case 14:
                System.out.println("The factorial of a number is the product of all the natural numbers preceding it");
                break;
            }
            this.caller();
        }
        else
        {
            System.out.println("Error. Try again");
            this.glossary();
        }
    }

    void factors()//factors of a number are the  numbers which divide it completely leaving no remainder
    {
        System.out.println("The factors of the number are:");
        System.out.println();
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }

    void palindrome()//the numbers which look equal when viewed straight as well as reversed
    {
        String s=Integer.toString(n);
        String rev="";
        for(int i=0;i<=s.length()-1;i++)
        {
            char c=s.charAt(i);
            rev=c+rev;
        }
        System.out.println("the reversed number is="+rev);
        if(rev.compareTo(s)==0)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }

    void perfect()//A number is said to be perfect if the sum of its factors other than itself is equal to the number
    {
        int s=0,f=1;
        System.out.println("The factors of the number other than itself are:");
        while(f<n)
        {
            if(n%f==0)
            {
                s=s+f;
                System.out.println(f);
            }
            f++;
        }
        System.out.println("The sum of factors="+s);
        if(s==n)
            System.out.println("The number is perfect");
        else
            System.out.println("The number is not perfect");
    }

    void binary()//convert a number into its binary equivalent
    {
        int m=n;
        String s="";
        while(m!=0)
        {
            int r=m%2;
            s=r+s;
            m=m/2;
        }
        System.out.println("The number in binary is "+s);
    }

    void fibonacci()//the fibonacci series start with 0 and 1;the consecutive digits are the sum of previous digits
    {
        int a=0,b=1,c=0,i=1;
        System.out.println("The Fibonacci series:");
        System.out.print(a+"\t"+b+"\t");
        while((a+b)<=n)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }

    void automorphic()//automorphic number is the number contained in the last digit of its square
    {
        int m=0;int c=0,p=0,d=0,s;
        m=n;
        while(m!=0)
        {
            m=m/10;
            d++;
        }
        double k=Math.pow(10,d);
        s=n*n;
        System.out.println("The square of the number="+s);
        p=s%(int)k;
        if(p==n)
        {
            System.out.println("The last digit(s) of the number is"+p);
            System.out.println("The number is automorphic");
        }
        else
            System.out.println("The number is not automorphic");
    }

    void prime()//prime  numbers are the numbers having only 1 and itself as factors
    {
        int c=0;
        System.out.println("The factors of the  number are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
                System.out.println(i);
            }
        }
        if(c==2)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }

    void buzznumber()//the numbers that end with 7 or is divisible by 7
    {
        System.out.println("The number divided by 7="+(n/7)+" and the remainder is="+(n%10));
        System.out.println("The last digit of the number="+(n%10));
        if((n%10==7||n%7==0))
            System.out.println("The  number is a buzz number");
        else
            System.out.println("The  number is not a buzz number");
    }

    void twinprime()//twin prime numbers are the consecutive prime numbers whose difference is 2
    {
        int i;
        boolean res1,res2;
        System.out.println("Twin primes are:");
        for(i=2;i<=n;i++)
        {
            res1=isprime(i);
            res2=isprime(i+2);
            if(res1==true && res2==true)
                System.out.println(i+","+(i+2));
        }
    }

    boolean isprime(int y)//part of twinprime function
    {
        int j,count=0;
        boolean result=false;
        for(j=1;j<=y;j++)
        {
            if(y%j==0)
                count++;
        }
        if(count==2)
        {
            result=true;
        }
        return result;
    }

    void special()//special number is a two digit number whose sum of the sum of digits and product of digits is equal to the number itself
    {
        int f,l,s,p;
        if(n<10 && n >99)
            System.out.println("Invalid number.(number should be of two digits)");
        else
        {
            f=n/10;
            l=n%10;
            s=f+l;
            System.out.println("Sum of digits="+s);
            p=f*l;
            System.out.println("Product of digits="+p);
            System.out.println("Total of the the sum and product");
            if((s+p)==n)
                System.out.println("The number is a special two digit number");
            else
                System.out.println("The number is not a special two digit number");
        }
    }

    void neon()//If the sum of the digits of the square of a number is the number itself, then the number is neon
    {
        int m=n*n,r,s=0;
        System.out.println("The square of the number is="+m);
        while(m!=0)
        {
            r=m%10;
            s=s+r;
            m=m/10;
        }
        System.out.println("The sum of digits="+s);
        if(s==n)
            System.out.println("The number is neon");
        else
            System.out.println("The number is not neon");
    }

    void armstrong()//If the sum of the cubes of the digits of a number is equal to that number, the number is called armstrong 
    {
        int m=n,r,s=0;
        while(m!=0)
        {
            r=m%10;
            s=s+(int)(Math.pow(r,3));
            m=m/10;
        }
        System.out.println("The sum of the cubes of digits is="+s);
        if(s==n)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
    }

    void duck()//The numbers which contain zero
    {
        int m=n;
        String a=Integer.toString(m);
        int l=a.length();
        int c=0;
        for(int i=0;i<=l-1;i++)
        {
            if(a.charAt(i)=='0')
                c++;
        }
        if(c>0)
            System.out.println("The number is a duck number");
        else
            System.out.println("The number is not a duck number");
    }

    void unique()//The numbers in which no digit is repeated
    {
        int m=n;
        String a=Integer.toString(m);
        int l=a.length();
        int c=0;
        for(char ch='0';(int)ch<=57;ch+=1)
        {
            for(int i=0;i<=l-1;i++)
            {
                if(a.charAt(i)==ch)
                    c++;
            }
            if(c>1)
            {
                System.out.println("The digit "+ch+" is repeating");
                System.out.println("The number is not a duck number");
            }
        }
        if(c<2)
            System.out.println("The number is duck number");
    }

    void factorial()//The product of all the numbers preceding the given number starting from one
    {
        int f=1;
        System.out.print(1);
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            System.out.print("*"+i);
        }
        System.out.println("The factorial of the number is="+f);
    }
    void caller()
    {
        int choice;
        if(loop==0)
        {
            this.execution();
            this.name();
            loop++;
        }
        System.out.println("\nHi "+name);
        System.out.println("\nTo see the main menu, press 1");
        System.out.println("To see the glossary,  press 2\n");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            this.menu();
            break;
            case 2:
            this.glossary();
            break;
            default:
            System.out.println();
            this.caller();
            break;
        }
        this.ask();
    }
    public static void main(String args[])
    {
        Main ob=new Main();
        ob.caller();
    }
}
