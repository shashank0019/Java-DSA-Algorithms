package Basicjavaandsomearrayconcept;
public class Compoundassigment 
{
    public static void main(String[] args)
    {
        //Compound assignment operator
        byte b=10;
        b+=5;
        System.out.println(b);

        // this is expression type
        byte c = 10;
        c= (byte)(c+5); //here we should do type casting or eles we get error 
        System.out.println(c);

    }
    
}
