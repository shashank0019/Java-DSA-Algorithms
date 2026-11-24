package Basicjavaandsomearrayconcept;
//1. Synatx error

/*public class Errors 
{

    public static void main(String[] args)
    {
        int a = 5  // synatx error because ";" is not there
    
        System.out.println(a);
    }
}*/

//2. Semantic error

/*public class Errors 
{

    public static void main(String[] args)
    {
        //semantic or logical error 
        // output is not same as expected output
        //jvm is giving this error. and code run aguthe edrali
        int a = 5;
        int b = 2;
        int area = 2*(a+b); //logic hear mistake 

        System.out.println(area);
    }
}*/


//3. wrong return type

/*public class Errors 
{
    static int add() //fix 2 instead of int right string
    {
        //return "hello";  // wrong return type 
        //fix 1
        return 100;

    }

    public static void main(String[] args)
    {
        System.out.println(add());
    }
}*/

//4. Duplicate local variable error

/*public class Errors 
{
    public static void main(String[] args)
    {
        int age = 25;
        //int age = 30; // error duplicate local variable
    
        //fix 1 --> change variable name
        int Age =30;
        System.out.println(age);
        System.out.println(Age);

        //fix 2--> update
        int age1=20;
        
        age1=30;
        System.out.println(age1);

    }
}*/

// 5. type mismatch

/*public class Errors 
{

    public static void main(String[] args)
    {
        int a = 5;
        byte b=a; // type mismatch
    
        System.out.println(a);
    }
}*/