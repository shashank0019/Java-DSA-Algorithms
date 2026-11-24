package Basicjavaandsomearrayconcept;
public class Sumofeven 
{

    public static int sumofevennum(int[] a)
    {
        int sum=0;
        for(int i=0; i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        //int[] a={10,50,4,3,9,7,11};
        //int[] a={-10,-50,-5,-1,-3,-7};
        //int[] a={-32,-1,-5,10,20,-50};
        //int[] a={0,0,0,0,0,0};
        int[] a={-1,10,5,-10,-50,-4,20,50};
        int result=sumofevennum(a);
        System.out.println(result);
    }
    
}
