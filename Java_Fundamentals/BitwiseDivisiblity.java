package Basicjavaandsomearrayconcept;
public class BitwiseDivisiblity 
{
    public static void main(String[] args)
    {
        int number = 40;
        int divisor = 8;

        if(((number) & (divisor-1))==0) // 00000111
        {
            System.out.println("Divisible");

        }
        else
        {
            System.out.println("Not divisible");
        }

    }
    
}
