package Basicjavaandsomearrayconcept;
public class TypecastVsTypepromotion 
{
    public static void main(String[] args)
    {
        // Error demo cant put int in byte
       /*  int a=10;
        byte b=a;
        System.out.println(b);*///error

        // int store in int
        int i =11;
        int j=i;
        System.out.println(j); //11 --No error

        //type cast - data loss or not?
        int x=10;
        byte y =(byte)x;
        System.out.println(y); // no error and no data loss

        //type cast and there is data loss
        int c=200;
        byte d=(byte)c;
        System.out.println(d); // no error but data loss

        // how long is stored in float
        long l=1234567890123456789l;
        float f= l;
        System.out.println(l);
        System.out.println(f);


        double n=l;
        System.out.println(n); // more precise output
    }

    
}
