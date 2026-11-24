package Basicjavaandsomearrayconcept;
public class Narrowing 
{
    public static void main(String[] args)
    {
        double d = 123.75;

        int i = (int)(d); // type casting  --> narrowing

        short s = (short)(d);

        byte b = (byte)(d);

        System.out.println(d);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);

    }


    
}
