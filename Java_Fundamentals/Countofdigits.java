package Basicjavaandsomearrayconcept;
import java.util.Scanner;
public class Countofdigits 
{
    public int coun(int a)
    {
        int count=0;
        while(a>0)
        {
            a=a/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();
        Countofdigits obj = new Countofdigits();
        int result=obj.coun(number);
        System.out.println(result);
        sc.close();
    }
    
}
