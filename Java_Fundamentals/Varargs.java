package Basicjavaandsomearrayconcept;
public class Varargs 
{

    static void show(int ...x) // 10, 20, 30
    {

        for(int i = 0; i<x.length; i++)
        {
            System.out.print(x[i]+" ");
        }
    }



    public static void main(String[] args)
    {
        show();
        show(10);
        show(10,20);
        show(10,20,30);

    }
    
}
