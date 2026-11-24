package Basicjavaandsomearrayconcept;
import java.util.*;
public class NestedIfElseIf 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter age");

        int age = sc.nextInt();

        System.out.println("enter percentage");

        int percentage=sc.nextInt();

        if(age>=18)
        {
            if(percentage>=90)
            {
                System.out.println("officer");
            }
            else if(percentage>=80)
        {
            System.out.println("clerk");
        }
        else if(percentage>=70)
        {
            System.out.println("jawan");
        }
        else
        {
            System.out.println("not qualified");
        }

        }
        else
        {
            System.out.println("age not eligible");

        }

        sc.close();

    }
    
}
