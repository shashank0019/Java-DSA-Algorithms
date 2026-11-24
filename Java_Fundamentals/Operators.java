package Basicjavaandsomearrayconcept;
public class Operators 
{
    public static void main(String[] args)
    {
        // In java relational operators return true or false only
        System.out.println("Relational Operators");
        int e = 20;
        int f = 10;

        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println(e >= f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);

        //Logical Operators
        System.out.println("Logical operators");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);


        // Compound Operators -- java does automatic type casting for these operators
        System.out.println("Compound Operators");
        int h = 10;
        h += 5;
        System.out.println(h);
        
        h -= 3;
        System.out.println(h);

        h *= 2;
        System.out.println(h);

        h /= 6;
        System.out.println(h);

        h %=3;
        System.out.println(h);

        //Ternary operators
        System.out.println("Ternary Operators");
        int i = 30;
        int j = 40;

        //syntax ---> datatype variable_name = (condition check)? true : false
        int max = (i>j)? i:j;
        System.out.println(max);   

    }
    
}
