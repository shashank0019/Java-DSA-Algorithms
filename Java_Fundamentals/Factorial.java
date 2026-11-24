package Basicjavaandsomearrayconcept;
public class Factorial 
{

    public static int getfactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;     
        }
        else
        {
            return n*getfactorial(n-1);
        }
        
    }
    public static void main(String[] args)
    {
        System.out.println(getfactorial(5));
    }
    
}
