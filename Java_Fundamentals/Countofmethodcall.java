package Basicjavaandsomearrayconcept;
public class Countofmethodcall 
{
    static int count = 0;
    public static void countcalls(int n)
    {
        count++;
        if(n==0)
        {
            return;   
        }
        countcalls(n-1);

    }

    public static void main(String[] args)
    {
        countcalls(3);
        System.out.println("Function calls:" + count);
    }
    
}
