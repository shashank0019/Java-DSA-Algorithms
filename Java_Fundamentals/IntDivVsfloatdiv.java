package Basicjavaandsomearrayconcept;
public class IntDivVsfloatdiv 
{
    public static void main(String[] args)
    {
        int a = 7;
        int b = 3;

        //interegr division
        System.out.println("integer divison: "+(a/b)); // 7/2 = 3

        int x = 7;
        int y = 3;

        //float division
        System.out.println("float divison: "+(x/y)); //3.5

        int p = 7;
        int q = 3;

        //double division
        System.out.println("double divison: "+(p/q)); // 3.5

        // type cast and divide
        System.out.println("float div int :"+((float)(a)/b));
        System.out.println("float div int :"+(a/(float)(b)));
        System.out.println("float div int :"+((double)(a)/b));
        System.out.println("float div int :"+(a/(double)(b)));

        // any one is double or float the answer will be double/float

        // some more comibination
        System.out.println(7/2);
        System.out.println(7/2.0);
        System.out.println(7.00/2);
        System.out.println(7/2.00);
    }

    
}
