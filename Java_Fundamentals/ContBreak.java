package Basicjavaandsomearrayconcept;
public class ContBreak 
{
    public static void main(String[] args)
    {
        System.out.println("==========Break==========");

        for(int i =1; i<=10; i++)
        {
            if(i==6)
            {
                break;
            }
            System.out.println(i);
        }

        System.out.println("============Contunie============");

        for(int j=1; j<=10; j++)
        {
            if(j==6)
            {
                continue;
            }
            System.out.println(j);
        }
    }
    
}
