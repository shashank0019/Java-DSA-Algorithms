package Basicjavaandsomearrayconcept;
public class MergingMasking 
{
    public static void main(String[] args)
    {
        System.out.println("Merging");

        int first = 5; // 00000101
        int second = 10;//00001010

        int result = (first << 4 | second);

        System.out.println(result);


        //Masking
        System.out.println("Masking");

        int number = 90;

        int resul = number &15; //00001111
        System.out.println(resul);
    }
    
}
