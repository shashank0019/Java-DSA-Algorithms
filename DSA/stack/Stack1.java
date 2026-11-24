
public class Stack1 {

    int size;
    int top;
    int[] stack;

    // Constructor: Automatically called when an object is created
    Stack1(int size) {
        this.size = size;       // Initialize instance variable
        top = -1;                // Initially stack is empty
        stack = new int[size];   // Create array
    }

    // isEmpty(): Checks whether the stack is empty
    // Return type: boolean
    boolean isEmpty() {
        return top == -1;
    }

    // isFull(): Checks whether the stack is full
    // Return type: boolean
    boolean isFull() {
        return top == size - 1;
    }

    // push(): Inserts an element into the stack
    // Parameter: value
    // Return type: void
    void push(int value) {

        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;                  // Move top to next position
        stack[top] = value;     // Insert element

        System.out.println(value + " inserted");
    }

    // pop(): Deletes the top element
    // Return type: int (returns deleted element)
    int pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top]; // Store top element
        top--;                  // Remove top logically

        return value;           // Return deleted element
    }

    // stackTop(): Returns the top element without deleting it
    // Return type: int
    int stackTop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    // peek(): Returns an element at a given position
    // Parameter: position
    // Return type: int
    int peek(int position) {

        int index = top - position + 1;

        if (index < 0 || index > top) {
            System.out.println("Invalid position");
            return -1;
        }

        return stack[index];
    }

    // display(): Displays all stack elements
    // Return type: void
    void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}
