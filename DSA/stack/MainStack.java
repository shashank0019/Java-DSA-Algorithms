
class MainStack {

    public static void main(String[] args) {

        // Creating Stack1 object
        // Constructor is automatically called with size 5
        Stack1 stack = new Stack1(5);

        // Checking whether the stack is empty
        System.out.println("is Empty: " + stack.isEmpty());

        // Inserting elements into the stack using push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(40);

        System.out.println();

        // Displaying all stack elements
        stack.display();

        System.out.println();

        // Getting the top element without deleting it
        System.out.println("top element: " + stack.stackTop());

        System.out.println();

        // Accessing elements based on their positions using peek()
        // Position 1 represents the top element
        System.out.println("element at position 1: " + stack.peek(1));
        System.out.println("element at position 2: " + stack.peek(2));
        System.out.println("element at position 3: " + stack.peek(3));
        System.out.println("element at position 4: " + stack.peek(4));
        System.out.println("element at position 5: " + stack.peek(5));

        System.out.println();

        // Removing the top element using pop()
        // pop() returns the deleted element
        System.out.println("Deleted: " + stack.pop());
        System.out.println("Deleted: " + stack.pop());

        System.out.println();

        // Displaying remaining elements after deletion
        stack.display();

    }
}
