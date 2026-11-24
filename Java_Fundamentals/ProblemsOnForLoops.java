package Basicjavaandsomearrayconcept;
public class ProblemsOnForLoops 
{
    public static void main(String[] args)
    {
        /*for(int i = 5; i<=25; i=i+5)
        {
            System.out.println(i);
        }*/

        //Using while
        /*int j=5;

        while (j<=25) 
        {
            System.out.println(j);
            j=j+5;
        }*/


        // print odd numbers

        /*for(int i=1; i<=9;i=i+2)
        {
            System.out.println(i);
        }*/

        //using while

        /*int i = 1;
        while (i<=9) 
        {
            System.out.println(i);
            i+=2;
            
        }*/

        //using do while

        /*int i = 1;
        do{
            System.out.println(i);
            i=i+2;
        }while(i<=9);*/


        //print numbers 10,9,8,7,6,5,4,3,2,1;

        /*for(int i = 10; i>=1; i--)
        {
            System.out.println(i);
        }*/
            


        //print even numbers in descending order from 10 to 2

        /*for(int i = 10; i>=2; i=i-2)
        {
            System.out.println(i);
        }*/

        // print square of 1 to 10

        /*for(int i = 1; i<=10; i++)
        {
            System.out.println((i*i));
        }*/

        //Double

        /*for(int i = 1; i <= 64; i=i*2)
        {
            System.out.println(i);
        }*/

        //Half

        for(int i = 64; i>=1;i=i/2)
        {
            System.out.println(i);
        }

    }
    
}
