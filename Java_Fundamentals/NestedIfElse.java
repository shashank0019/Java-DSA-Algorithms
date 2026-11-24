package Basicjavaandsomearrayconcept;
public class NestedIfElse 
{
    public static void main(String[] args)
    {
        int age = 20;
        int height = 175;
        boolean medicalFit = true;

        if(age>=18)
        {
            if(height>=170)
            {
                if(medicalFit)
                {
                    System.out.println("selected");
                }
                else
                {
                    System.out.println("not selected");
                }
            }
            else
            {
                System.out.println("Height not matched");
            }
        }
        else
        {
            System.out.println("age not eligible");
        }
    }
    
}
