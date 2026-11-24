package Basicjavaandsomearrayconcept;
import java.util.*;

public class CombineConditions 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        System.out.println("Enter height");
        int height = sc.nextInt();

        System.out.println("enter percentage");
        double percentage=sc.nextDouble();

        System.out.println("are you medically fit");
        boolean medicalFit = sc.nextBoolean();

        System.out.println("\n=================AND(&&)===============");
        System.out.println("&&---> All one condition must be true");

        //All condition must be true

        if(age>=18 && height>=170 && medicalFit)
        {
            System.out.println("Eligible for army");
        }

        else
        {
            System.out.println("Not eligiblr for Army");
        }

        System.out.println("\n======================OR(||)================");
        System.out.println("||---> Atleast one condition must be true");

        if(percentage>=90 || medicalFit)
        {
            System.out.println("Special Consideration");
        }

        else
        {
            System.out.println("no special consideration");

        }

        //reverse boolean
        System.out.println("Reverse boolean");
        if(!medicalFit)
        {
            System.out.println("medical test failed");
        }
        else
        {
            System.out.println("passed");

        }

        //Combinig all operator
        System.out.println("combine all operator");
        if((age>18 || height>=170) && (percentage>=60 || medicalFit))
        {
            System.out.println("Final selection Eligible");
        }
        else
        {
            System.out.println("rejected");
        }

        sc.close();

    }
    
}
