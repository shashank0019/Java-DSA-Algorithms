package Basicjavaandsomearrayconcept;
public class Patterns 
{
    public static void main(String[] args)
    {
        //* * * * * 
        //* * * * * 
        //* * * * * 
        //* * * * *  

        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }*/

        // left triangle
        // *
        // * * 
        // * * *
        // * * * * 
        // * * * * * 
        
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Invert left triangle
        // * * * *
        // * * *
        // * * 
        // *

       /*for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/


        //Right triangle
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *


        /*for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //Inverted Right triangle
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *

        /*for(int i = 5; i>=1; i--)
        {
            for(int j = 1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Amstrong Number code   
        int o=407; 
        int a=o;
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+(n*n*n);
            a=a/10;      
        }

        if(o==sum)
        {
            System.out.println(o+" is Amstrong number ");
        }
        else{
            System.out.println(o+" is not Amstrong number ");
        }

        
    }
    
}
