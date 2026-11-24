package Basicjavaandsomearrayconcept;
import java.util.Scanner;

public class EveOdd 
{
    
    public static void evenodd1(int a)
    {
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        evenodd1(number);

        sc.close();
    }
    
}
