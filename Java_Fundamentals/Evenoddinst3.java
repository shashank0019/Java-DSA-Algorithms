package Basicjavaandsomearrayconcept;
import java.util.Scanner;

public class Evenoddinst3 {

        public boolean evenodd1(int a)
    {
        if(a % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        Evenoddinst3 obj =new Evenoddinst3();

        boolean result = obj.evenodd1(number);

        if(result)
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
