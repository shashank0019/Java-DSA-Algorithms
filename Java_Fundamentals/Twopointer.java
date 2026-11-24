package Basicjavaandsomearrayconcept;
public class Twopointer 
{
    void twopointeratend(int[] num)
    {
        int left=0;
        int right=num.length-1;

        while(left<=right)
        {
            if(left==right)
            {
                System.out.println(num[left]);
            }
            else
            {
                System.out.println(num[left]+" ---> "+num[right]);        
            }
            left++;
            right--;
            
        }
        System.out.println();

    }


    void twopointeratmiddle(int[] num)
    {
        int left=0;
        int right=0;
        if(num.length%2==0)
        {
            left=(num.length/2)-1;
            right=num.length/2;    
        }

        else
        {
            left=num.length/2;
            right=left;

        }


        while(left>=0 && right<num.length)
        {
            if(left==right)
            {
                System.out.println(num[left]);
            }
            else
            {
                System.out.println(num[left]+" ---> "+num[right]);        
            }
            left--;
            right++;
            
        }
        System.out.println();

    }

    public static void main(String[] args)
    {
        int[] b={10,20,30,40,50,60,70,80,90};
        int[] a={10,20,30,40,50,60,70,80};

        Twopointer obj=new Twopointer();

        obj.twopointeratend(b);
        
        obj.twopointeratend(a);

        obj.twopointeratmiddle(b);

        obj.twopointeratmiddle(a);
    }
    
}
