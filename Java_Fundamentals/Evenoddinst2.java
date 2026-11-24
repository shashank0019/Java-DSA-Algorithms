package Basicjavaandsomearrayconcept;
import java.util.Scanner;
public class Evenoddinst2 {

    public int evenodd1(int a)
    {
        if(a % 2 == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        Evenoddinst2 obj =new Evenoddinst2();

        int result = obj.evenodd1(number);

        if(result==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
        sc.close();
    }
    
}
    
