package Basicjavaandsomearrayconcept;
import java.util.Scanner;
public class Evenodd2 {

    public static int evenodd2(int a)
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

        int result=evenodd2(number);
        if(result==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
            

        sc.close();
    }
    
}


