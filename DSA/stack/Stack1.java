public class Stack1{

    int size;
    int top;
    int[] stack;

    Stack1(int size) //constructor is special methos in java does not  have retrun type
    {
        this.size =5; //this is a keyword 
        top=-1;
        stack = new int[size];

    }

    //isEmpty()
    boolean isEmpty()
    {
        return top ==-1;
    }

    //is full
    boolean isFull()
    {
        return top ==size-1;
    }

    //push()
    void push(int value){
        if(isFull()){
            System.out.println("staack is full");

        }

        top++;
        stack[top]= value;
        System.out.println(value+"inserted");

    }


    //pop()
    int pop(){
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return-1;
        }

        int value =stack[top];
        top--;
        return value;

    }

    //stackTop()
    int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return-1;
        }

        return stack[top];
    }


    //peek
    int peek(int position)
    {
       int index = top-position+1;
        if(index < 0 || index > top)
        {
            System.out.println("invalid index");
            return -1;
        }
        return stack[index];




    }

    //display
    void display()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("\n stack elemnets");
        for(int i = top; i >= 0; i--){
    System.out.print(stack[i] + " ");
}
    }


    
}