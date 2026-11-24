package Basicjavaandsomearrayconcept;
public class Myarr 
{
    //Method - 1 : Print all elements --> Traversing an array

    public void printElements(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    
    }

    //Method - 2 : Print First, middle and last -- index based access

    public void printFirstMiddleLast(int arr[]) 
    {
        System.out.println("\nFirst Element: " + arr[0]);
        System.out.println("Middle Element: " + arr[arr.length / 2]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    //Method - 3 :Print length of an array

    public void printLength(int[] arr)
    {
        System.out.println(arr.length);
    }

    //Method - 4: Modify third element-- update array
    void modifyArray(int[] arr)
    {
        arr[2]=100;
        System.out.println("After Modifying");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //Method 5 : Demo of reference copy
    void referenceCopy(int[] arr)
    {
        int[] copy=arr;

        System.out.println("\nBefore");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        copy[0]=100;

        System.out.println("\nDuplicate array");
        
        for(int i = 0; i<copy.length;i++)
        {
            System.out.print(copy[i]+" ");
        }
    }

    //Method 6 : Diffrent type of arrays
    void differenttypeofarr(int[] numbers, double[] salaries, char[] grades, boolean[] status, String[] names)
    {
        System.out.println("\nInteger Array");

        for(int i = 0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        
        }
        System.out.println();

        for(int i = 0; i<salaries.length; i++)
        {
            System.out.print(salaries[i]+" ");
        }
        System.out.println();

        for(int i = 0; i<grades.length; i++)
        {
            System.out.print(grades[i]+" ");
        }
        System.out.println();

        for(int i = 0; i<status.length; i++)
        {
            System.out.print(status[i]+" ");
        }
        System.out.println();

        for(int i = 0; i<names.length; i++)
        {
            System.out.print(names[i]+" ");
        }
        System.out.println();
    }

    //Method 7 : Empty Array
    void emptyArray(int[] a)
    {
        System.out.println("Length: "+ a.length);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    //Method 8 : null array

    void nullArray(int[] b)
    {
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Myarr obj = new Myarr();

        int arr[] = {10, 20, 30, 40};

        //Method 1
        obj.printElements(arr);

        //Method 2
        obj.printFirstMiddleLast(arr);

        //Method 3
        obj.printLength(arr);

        //Method 4
        obj.modifyArray(arr);

        //Method 5
        obj.referenceCopy(arr);

        //Method 6
        int[] numbers = {11, 12 ,13};
        double[] Salaries = {250000,370000.2254,2541000.2155};
        char[] grades={'A', 'B','c'};
        boolean[] status={true , false , true};
        String[] names={"Ram", "Mohan", "Latha"};
        obj.differenttypeofarr(numbers, Salaries, grades, status, names);

        //Method 7
        
        int[] a = {};
        obj.emptyArray(a);

        //Method 8

        int[] b = null;
        obj.nullArray(b);

    } 
}
