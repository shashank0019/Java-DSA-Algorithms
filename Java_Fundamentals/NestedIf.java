package Basicjavaandsomearrayconcept;
public class NestedIf 
{
    public static void main(String[] args){

    
    int age = 20;
    int height = 175;
    boolean medicalFit = true;
    boolean pysicalPass = true;

    if(age>=18)
    {
        if(height>170)
        {
            if(medicalFit)
            {
                if(pysicalPass)
                {
                    System.out.println("selected");
                }
            }
        }
    }
}

}

