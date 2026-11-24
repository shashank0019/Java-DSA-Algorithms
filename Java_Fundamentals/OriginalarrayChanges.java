package Basicjavaandsomearrayconcept;
public class OriginalarrayChanges 
{
    static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    //lets change
    static void change(int[] x)
    {
        System.out.println("Before Modification");
        printArray(x);

        x[0]=999;

        System.out.println("After Modification");
        printArray(x);
    }
    public static void main(String[] args)
    {
        int[] a={1,2,3,4};
        System.out.println("Before calling change");
        printArray(a);
        change(a);

        System.out.println("After calling change");
        printArray(a);

    }
    
}
