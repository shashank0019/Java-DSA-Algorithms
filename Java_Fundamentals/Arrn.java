package Basicjavaandsomearrayconcept;
public class Arrn 
{
    public static int[] getlargest(int[] a)
    {
        int max=a[0];
        int max2=max;

        if(a.length==1)
        {
            return new int[]{max,-1};
        }

        else
        {
    
            for(int i=1;i<=a.length-1;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }  
            }

            for(int i=1;i<=a.length-1;i++)
            {
                if(a[i]>max2 && a[i]<max)
                {
                    max2=a[i];
                }
            }
        }

        return new int[]{max,max2};
    }

    public static void main(String[] args)
    {
        //int[] a={1,2,3,8,10,2,40};
        //int[] a={-10,-5,-40,-6};
        int[] a={0,0,0,0,0,0};
        int[] result=getlargest(a);
        for (int i=0;i<=result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    
}
