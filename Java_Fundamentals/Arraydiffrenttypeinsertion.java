package Basicjavaandsomearrayconcept;
public class Arraydiffrenttypeinsertion 
{
    int [] array;
    int length;
    int rightIndex;

    public Arraydiffrenttypeinsertion()
    {
        length=5;
        array=new int[length];
        rightIndex=0;
    }

    //Insert At end
    
    public void insertAtEnd(int value)
    {
        // Array is full
        if(rightIndex == length)
        {
            System.out.println("Array Is full");
            return;

        }

        else
        {
            array[rightIndex]=value;
            rightIndex++;

        }
    }

    //Insert at start

    public void inserAtStart(int value)
    {
        // Array is full
        if(rightIndex == length)
        {
            System.out.println("Array Is full");
            return;

        }

        else
        {
            //shift elements
            for(int i=rightIndex-1;i>=0;i--)
            {
                array[i+1]=array[i];
            }
            //insert
            array[0] =value;
            rightIndex++;  //increase size as u have inserted one extra element
        }

    }


    //Insert at certain position

    public void insertAtPosition(int value,int pos)
    {

        // Array is full
        if(rightIndex == length)
        {
            System.out.println("Array Is full");
            return;

        }
        
        //edge case - 2

        else if(pos>rightIndex || pos<0)
        {
            System.out.println("Invalid position");
            return;
        }

    
        else
        {
            for(int i=rightIndex-1;i>=pos;i--)
            {
                array[i+1]=array[i];
            }

            array[pos]=value;
            rightIndex++;
        }

    }

    //Deletion at end
    public void deleteAtEnd()
    {
        // Array is empty
        if(rightIndex == 0)
        {
            System.out.println("Array Is empty");
            return;
        }

        else
        {
            rightIndex--;
            array[rightIndex]=0;
            
        }
    }

    //Deletion at start
    public void deleteAtStart()
    {
        // Array is empty
        if(rightIndex == 0)
        {
            System.out.println("Array Is empty");
            return;
        }

        else
        {
            for(int i=0;i<rightIndex-1;i++)
            {
                array[i]=array[i+1];
            }
            rightIndex--;
            array[rightIndex]=0;

        }
    }

    //delete at certain position
    
    public void deleteAtPosition(int position)
    {
        // Array is empty
        if(rightIndex == 0)
        {
            System.out.println("Array Is empty");
            return;
        }

        else
        {
            for(int i=position;i<rightIndex-1;i++)
            {
                array[i]=array[i+1];
            }
            rightIndex--;
            array[rightIndex]=0;

        }
    }

    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(i+"\t"+array[i]);
        }
        System.out.println();
        System.out.println("size: "+rightIndex);
        System.out.println();
    }


    public static void main(String[] args)
    {
        Arraydiffrenttypeinsertion myArray = new Arraydiffrenttypeinsertion();

        System.out.println("Initila array");
        
        myArray.display();

        myArray.insertAtEnd(10);

        myArray.insertAtEnd(20);

        System.out.println("After inserting 10 and 20 at end");
        myArray.display();

        myArray.inserAtStart(5);

        System.out.println("\n After Inserting 5 at the start");
        myArray.display();

        myArray.insertAtPosition(15, 2);
        myArray.display();

        System.out.println("giving wrong position");
        myArray.insertAtPosition(99, -1);

        myArray.inserAtStart(100);
        myArray.display();

        myArray.deleteAtEnd();
        myArray.display();

        myArray.deleteAtStart();
        myArray.display();

        myArray.deleteAtPosition(2);
        myArray.display();
        
    }
    
}
