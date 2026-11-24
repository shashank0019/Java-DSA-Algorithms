package Basicjavaandsomearrayconcept;
public class Loops 
{
    public static void main(String[] args)
    {
        //For loop demo

        /*for(int i = 1; i<=5; i++)
        {
            System.out.println(i);
        }*/

        //While loop demo
        
        /*int i=1;
        while (i<=5) 
        {
            System.out.println(i);
            i++;
        } */  

        // Do while

        /*int i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=5);*/

        //For each

        int[] numbers = {10,20,30,40,50}; //number----> [10,20,30]

        for(int pick : numbers)
        {
            System.out.println(pick);
        }    



    }
    
}
