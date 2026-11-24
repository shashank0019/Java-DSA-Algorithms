package Basicjavaandsomearrayconcept;
// Different Arguments
public class MethodOverloading 
{
    public static void show()
    {
        System.out.println("hi");
    }

    public static void show(int a)
    {
        System.out.println("one integer");
    }

    public static void show(int a, int b)
    {
        System.out.println("two integers");
    }

    //different data types

    public static void display(int a)
    {
        System.out.println("int");
    } 

    public static void display(double a)
    {
        System.out.println("double");
    }

    public static void display(float a)
    {
        System.out.println("float");
    }

    
    public static void display(char a)
    {
        System.out.println("char");
    }

    
    public static void display(String a)
    {
        System.out.println("string");
    }

    // diffrent order of parameter

    public static void print(int a, double b)
    {
        System.out.println("int double");
    }

    
    public static void print(double a, int b)
    {
        System.out.println("double int");
    }

    // Mix of everything

    
    public static void add()
    {
        System.out.println("No Args");
    }

    
    public static void add(int a)
    {
        System.out.println("one intger");
    }

    
    public static void add(int a, int b)
    {
        System.out.println("two integer");
    }

    
    public static void add(double a, double b)
    {
        System.out.println("two doubles");
    }

    //Automatic Type Promotion
    
    public static void type(int a)
    {
        System.out.println("int ");
    }

    public static void type(double a)
    {
        System.out.println("double");
    }


    //Exact match gets first priority

    public static void exact(int a)
    {
        System.out.println("int");
    }

    public static void exact(long a)
    {
        System.out.println("long");
    }

    //return type change
    public static int add1(int a,int b)
    {
        return a+b;
    }
    

    /*public static double add1(int a,int b)
    {
        return a+b;
    }*/

    //character promotion
    public static void show1(int a)
    {
        System.out.println("int");
    }

    public static void show1(char a)
    {
        System.out.println("char");
    }

    //Parameters name dont matters
    public static void display1(int x)
    {

    }
    //error
    /*public static void display1(int y)
    {
    }*/


    // Ambiguity

    public static void show2(float a)
    {
        System.out.println("float");
    } 

    public static void show2(double a)
    {
        System.out.println("double");
    }


    public static void main(String[] args)
    {
        show(); // no args
        show(10);// single args
        show(10,20);// double args
        // show(10,20,30); Error

        display(10);
        display(10.5);
        display('A');
        display("Java");


        print(10, 10.5);
        print(10.5, 10);

        add();
        add(10);
        add(10,20);
        add(5.5,6.5);

        byte b = 10;
        short s =20;
        float f=30.5f;

        type(b);
        type(s);
        type(f);

        int x=10;
        int y=20;

        exact(x);
        exact(y);


        int result=add1(10,20);
        System.out.println(result);

        char ch='A';
        show1(ch);
        show(ch);

        show2(10);


    }
    
}
