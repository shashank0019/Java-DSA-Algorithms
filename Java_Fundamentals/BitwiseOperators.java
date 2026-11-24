package Basicjavaandsomearrayconcept;
public class BitwiseOperators 
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 6;

        System.out.println("AND: "+(x&y));
        System.out.println("OR: "+(x|y));
        System.out.println("EXOR: "+(x^y));
        System.out.println("NOT: "+(~x)); // -11
        System.out.println("NOT: "+(~y)); // -7 
        System.out.println();

        // shifting
        System.out.println("Left shift by 1 : "+(x<<1));  //20
        System.out.println("Left shift by 2 : "+(x<<2));  //40
        System.out.println("Right shift by 1 : "+(x>>1)); //5
        System.out.println("Right shift by 2 : "+(x>>2)); //2
        System.out.println();

        //Unsigned right shit
        System.out.println("Unsigned Right shift");
        int z = -10;
        System.out.println("Signed right shift by 1: "+(z>>1)); //-5
        System.out.println("UnSigned right shift by 1: "+(z>>>1));
        
        byte b=-10;
        System.out.println("Unsigned right shift by 1: "+(byte)(b>>>1));

        
    }
    
}
