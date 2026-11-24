package Basicjavaandsomearrayconcept;
//Static Methods
public class Methods 
{
    public static void greet()//no args, no return method
    {
        System.out.println("hello");
    }

    public static void printsum(int a, int b) // arguments , No return(its printing)
    {
        System.out.println(a+b);
    }

    public static int getnumber() // No arguments, but returns
    {
        return 100;
    }

    public static int max(int a, int b) // taking arguments and return
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        greet();
        printsum(10,20);
        int num=getnumber();
        int max = max(4,5);
        System.out.println(num);
        System.out.println(max);
    }
    
}
