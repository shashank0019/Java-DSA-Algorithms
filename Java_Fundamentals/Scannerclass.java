package Basicjavaandsomearrayconcept;
import java.util.*;
public class Scannerclass 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //sc -->[ ]
        
        int a, b, c; // place create madbeku to store the values

        System.out.println("Enter first number:");
        a=sc.nextInt(); // "25" -- string

        System.out.println("Enter second number:25");
        b=sc.nextInt(); // "30" --string

        c=a+b;

        System.out.println("sum is: "+c);

        sc.close();

    }
    
}
