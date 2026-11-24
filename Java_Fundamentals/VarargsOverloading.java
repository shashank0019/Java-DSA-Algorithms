package Basicjavaandsomearrayconcept;
public class VarargsOverloading 
{
    public static void show(int ...x)
    {
        System.out.println("int type");
    }

    public static void show(double...y)
    {
        System.out.println("double type");
    }


    public static void main(String[] args)
    {
        show(10,20,30);
        show(10.2,10.5);
    }
    
}
