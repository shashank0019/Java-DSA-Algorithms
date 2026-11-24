package Basicjavaandsomearrayconcept;
public class MethodCallingMethods 
{
    
    public static void greet()
    {
        System.out.println("To Algorithm");
    }

    public static void welcome()
    {
        System.out.println("Welcome");
        greet();

        System.out.println("Welcome methods ends");
    }
    
    public static void main(String[] args)
    {
        System.out.println("main starts");
        welcome();

        System.out.println("main ends");
        
    }
    
}
