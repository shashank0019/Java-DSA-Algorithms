package Basicjavaandsomearrayconcept;
public class InccreDec 
{
    public static void main(String[] args)
    {
        //-------Section 1---------
        System.out.println("Section : 1 - Post Increment And Pre Increment");
        int a = 10;

        System.out.println(a++); //10
        System.out.println(a); //11

        System.out.println(a++);//11
        System.out.println(a);//12

        System.out.println(++a);//13
        System.out.println(a);//13

        System.out.println(a++);//13
        System.out.println(a);//14


        //-------Section 2---------
        System.out.println("Section : 2 - Post Decrement And Pre Decrement");
        int b = 14;

        System.out.println(b--);//14
        System.out.println(b); //13

        System.out.println(--b);//12
        System.out.println(b);//12

        System.out.println(b--);//12
        System.out.println(b);//11

        System.out.println(b--);//11
        System.out.println(b);//10

        //-------Section 3---------
        System.out.println("Section : 3 - Assignment with Post Increment");
        int c = 10;

        int d =c++;

        System.out.println(d); //10
        System.out.println(c); //11
        

        //-------Section 4---------
        System.out.println("Section : 4 - Assignment with Pre Increment");
        int e = 10;

        int f =++e;

        System.out.println(e); //11
        System.out.println(f); //11


        // homework -- take input, assigne with decrement(Pre and post)


        //-------Section 5---------
        System.out.println("Section : 5 - simple expression");
        int g = 10;

        System.out.println(g++ +5); //15
        System.out.println(g); //11

        System.out.println(++g +5);//17
        System.out.println(g);//12


        //-------Section 6---------
        System.out.println("Section : 6 - complex expressions");
        int h = 10;

        System.out.println(h++ + ++h);//22 
        System.out.println(h++ - ++h);// -2

        System.out.println(++h - ++h);//-1
        System.out.println(++h - h++);//0
        System.out.println(h);//18
        System.out.println(++h - (--h));//1
        System.out.println(h);//18


        // homework -- mix the expression ---> ++ + --  


        //-------Section 7---------
        System.out.println("Section : 7 - Char Increment");
        int ch1 = 'A';

        System.out.println((char)ch1++);//A
        System.out.println((char)ch1);//B

        System.out.println((char)++ch1);//c
        System.out.println((char)ch1);//c

        //homework char decrement
        //home work -- char and Ascii/Unicode

        //-------Section 8---------
        System.out.println("Section : 8 - Char and ascii/unicode");
        char ch2='9'; //unicode --57

        System.out.println(++ch2);//58
        System.out.println(ch2);//58
        System.out.println();

         //-------Section 9---------  ++ and -- wont work in boolean
        System.out.println("Section : 9 - Boolen  ++ and -- wont work in boolean");
        /*boolean flag=true;
        flag++;
        ++flag;
        flag--;
        --flag;*/


        //-------Section 10---------  ++ and -- can be applied to vaiabels only not literals
        System.out.println("Section : 10 - Literals -- fixed values caanot be compiled get error");
        /*System.out.println(10++);  //cant be complied
        System.out.println(++10); //cant be complied */


    }
    
}
