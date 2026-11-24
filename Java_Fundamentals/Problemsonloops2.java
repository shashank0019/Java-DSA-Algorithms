package Basicjavaandsomearrayconcept;
//import java.util.*;
public class Problemsonloops2 
{
    public static void main(String[] args)
    {
        // sum of natural numbers

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1; i<=a;i++)
        {
            sum=sum+i;
            
        }
        System.out.println("sum of first "+a+" numbers is: "+sum);

        sc.close();*/

        //Factorial code

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        
        int a=sc.nextInt();
        int fact=1;
        
        for(int i=2;i<=a;i++)
        {
            fact*=i;
        }
        
        System.out.println("Factorial of "+a+" is: "+fact);

        sc.close();*/



        //(1,1),(1,2),(1,3)
        //(2,1),(2,2),(2,3)
        //(3,1),(3,2),(3,3)
        
        for(int i=1; i<=3;i++)
        {
            for(int j=1; j<=3;j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }





    }
    
}
