package Basicjavaandsomearrayconcept;
import java.util.Scanner;
public class Evenoddinst{

    public void evenodd(int a)
    {
        if(a % 2 == 0)
        {
            System.out.println("Even");
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

        Evenoddinst obj =new Evenoddinst();

        obj.evenodd(number);

            

        sc.close();
    }
    
}