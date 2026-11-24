package Basicjavaandsomearrayconcept;
import java.util.Scanner;

public class NumberPalindrome
{
    public int numpali(int a)
    {
        int num=a;
        int n=0;
        while(a>0)
        {
            int rem=a%10;
            n=n*10+rem;
            a/=10;
        }
        if(num==n)
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
            NumberPalindrome obj = new NumberPalindrome();
            int result=obj.numpali(number);

            if(result==0)
            {
                System.out.println("palindrome");
            }

            else
            {
                System.out.println("not palindrome");
            }
            
            sc.close();
        }
    }
    

