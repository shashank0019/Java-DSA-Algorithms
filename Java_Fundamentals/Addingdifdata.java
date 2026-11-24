package Basicjavaandsomearrayconcept;
public class Addingdifdata 
{
    public static void main(String[] args)
    {
        byte b = 15;
        short s = 20;

        char c = 'A'; // Ascii ---> 65

        int i = 30;
        long l = 40L;
        float f = 50.52f;
        double d = 65.35;
        
        // for byte
        System.out.println("byte +byte: "+(b+b));
        System.out.println("byte +short: "+(b+s));
        System.out.println("byte +char: "+(b+c));
        System.out.println("byte +int: "+(b+i));
        System.out.println("byte +long: "+(b+l));
        System.out.println("byte +float: "+(b+f));
        System.out.println("byte +double: "+(b+d));

    }
    
}
