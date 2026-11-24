package Basicjavaandsomearrayconcept;
public class Nestedloops 
{
    public static void main(String[] args)
    {
        //for inside for

        /*for(int i = 1; i<= 3; i++)
        {
            for(int j = 1; j<=3; j++)
            {
                System.out.println("i = "+i +"   j = "+j);
            }
        }*/

        //while inside while

        int i=1;
        while(i<=3)
        {
            int j=1;
            while (j<=3) 
            {
                System.out.println("i= "+i+"    j= "+j);
                j++;
            }
            i++;
        }

    }
    
}
