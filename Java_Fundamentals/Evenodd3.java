package Basicjavaandsomearrayconcept;
import java.util.Scanner;
public class Evenodd3 {
    public static boolean iseven(int a)
    {
    
        if(a % 2 == 0)
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        boolean result=iseven(number);
        if(result)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
            

        sc.close();
    }
    
}

