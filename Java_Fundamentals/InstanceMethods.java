package Basicjavaandsomearrayconcept;
public class InstanceMethods 
{

    public void greet()//no args, no return method
    {
        System.out.println("hello");
    }

    public void printsum(int a, int b) // arguments , No return(its printing)
    {
        System.out.println(a+b);
    }

    public int getnumber() // No arguments, but returns
    {
        return 100;
    }

    public int max(int a, int b) // taking arguments and return
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        //Single object for all methods
        /*InstanceMethods obj=new InstanceMethods();
        obj.greet();
        obj.printsum(10,20);
        int num=obj.getnumber();
        int max = obj.max(4,5);
        System.out.println(num);
        System.out.println(max);*/


        //one objects for one method

        InstanceMethods obj1=new InstanceMethods();
        obj1.greet();
        InstanceMethods obj2=new InstanceMethods();
        obj2.printsum(10,20);
        InstanceMethods obj3=new InstanceMethods();
        obj3.getnumber();
        InstanceMethods obj4=new InstanceMethods();
        obj4.max(10,20);

    }
    
}
