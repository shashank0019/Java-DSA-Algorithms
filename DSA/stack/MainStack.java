class MainStack{
     public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        System.out.println("is Empty"+ stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(40);
        System.out.println();
        stack.display();
        System.out.println();

        System.out.println("top element"+stack.stackTop());

        System.out.println();

        System.out.println("element at position element"+stack.peek(1));
        System.out.println("element at position element"+stack.peek(2));
        System.out.println("element at position element"+stack.peek(3));
        System.out.println("element at position element"+stack.peek(4));
        System.out.println("element at position element"+stack.peek(5));

        System.out.println();

        System.out.println("Deleted:"+stack.pop());
        System.out.println("Deleted:"+stack.pop());
         System.out.println();
          stack.display();
         


    }

    
}