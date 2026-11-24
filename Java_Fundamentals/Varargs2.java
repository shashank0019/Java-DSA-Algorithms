package Basicjavaandsomearrayconcept;
// Passing diffrent data types seperatly using varargs
public class Varargs2 
{

    public static void student(String name, int age, int ...marks)
    {
        System.out.println(name);

        System.out.println(age);

        for(int i: marks)
        {
            System.out.print(i+ " ");
        }
    }


    public static void main(String[] args)
    {
        student("Rohith", 21, 70, 80, 90);
        
        student("Divya", 22, 65, 75);
    }
    
}
