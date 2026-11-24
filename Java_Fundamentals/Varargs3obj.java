package Basicjavaandsomearrayconcept;
// pass diff data types together using object
public class Varargs3obj 
{
    public static void show(Object... obj)
    {
        for(Object i : obj)
        {
            System.out.println(i);

        }

    }


    public static void main(String[] args)
    {
        show(101,"Rahul",92.5, true,'A');
    }
}

