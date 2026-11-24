package Basicjavaandsomearrayconcept;
public class Singlelargest 
{
    public static int getlargest(int[] a)
    {
        int max=a[0];
        for(int i=1; i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    
    
    
    public static void main(String[] args)
    {
        //int[] a={40,50,30,7,4,5};
        //int a[]={-40,-10,-5,-20,-2};
        //int a[]={0,0,0,0,0,0,0,0};
        int[] a={-10,-1,-5,10,20,-50};
        int Result=getlargest(a);
        System.out.println(Result);

    }
    
}
