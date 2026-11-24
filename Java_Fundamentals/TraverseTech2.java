package Basicjavaandsomearrayconcept;
public class TraverseTech2 
{
    void getreverse(int[] num)
    {
        for(int i=num.length-1;i>=0;i--)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

    void printIndexandvalue(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.println("Index= "+i+"      "+"value= "+num[i]);
        }
        System.out.println();

    }

    void Firsthalf(int[] num)
    {
        for(int i=0;i<num.length/2;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

    void secondhalf(int[] num)
    {
        for(int i=num.length/2;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

    //alternate

    void alternatefromstart(int[] num)
    {
        for(int i=1;i<num.length;i+=2)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();

    }


    void alternatefromend(int[] num)
    {
        for(int i=num.length-1;i>=0;i-=2)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

    void evenindex(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println();

    }

    void oddindex(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println();

    }

    void findnumgreater(int[] num, int n)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>10)
            {
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println();
    }


    void printbetweengivenelements(int[] num, int a ,int b)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>a && num[i]<b)
            {
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println();
        
    }

    
    void printnumdivbynum(int[] num,int number)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%number==0)
            {
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println();

    }



    public static void main(String[] args)
    {
        int [] a={10,20,30,40};

        TraverseTech2 obj=new TraverseTech2();

        obj.getreverse(a);

        obj.printIndexandvalue(a);
        
        obj.Firsthalf(a);
        
        obj.secondhalf(a);
        
        obj.alternatefromstart(a);

        obj.alternatefromend(a);

        obj.evenindex(a);

        obj.oddindex(a);

        obj.findnumgreater(a,10);

        obj.printbetweengivenelements(a,10,40);

        obj.printnumdivbynum(a, 20);


    }
    
}
