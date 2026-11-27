package LinkedList;

public class SinglyLinkedList {

    private Node head;
    private int count;

    public SinglyLinkedList(){
        this.head = null;
        this.count =0;
    }

    public void printAllNodes(){

        System.out.print("head --> ");

        if(this.head==null){
            System.out.println("null");
            return;
        }else{
            Node walker = this.head;
            while(walker!=null){
                System.out.print(walker.data +" --> ");
                walker = walker.next;
            }
             System.out.println("null");
             System.out.println(this.count);
        }

        

    }

    //insert at start

    void insertAtStart(int value){
        Node newNode =new Node(value);
        //1] list is empty
        if(this.head==null){
            this.head=newNode;
        }else{//2] and3] one or more
            newNode.next= this.head;
            this.head=newNode;
        }
        this.count++;
    }


    //insert at end
    void insertAtEnd(int value){
    Node newNode = new Node(value);

    if(this.head == null){
        this.head = newNode;
    }else{
        Node currentNode = this.head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    this.count++;
}
//insetat position
    void insertAtPostion(int value, int position){

    if(position < 1 || position > this.count+1){
        System.out.println("Invalid position");
        return;
    }

    if(position == 1){
        insertAtStart(value);
        return;
    }

    if(position == this.count){
        insertAtEnd(value);
        return;
    }

    Node newNode = new Node(value);

    Node currentNode = this.head;
    int coun = 1;

    while(coun < position - 1){
        currentNode = currentNode.next;
        coun++;
    }

    newNode.next = currentNode.next;
    currentNode.next = newNode;

    this.count++;
}


boolean search(int value) {
    boolean isFound = false;
    
    if (this.head == null) {
        System.out.println("List is empty");
        
    }else{
     Node currentNode = this.head;
     int position =1;
    
    while (currentNode!=null) {

        if (currentNode.data == value) {
            System.out.println("Element found  " + position);
            isFound = true;
        }

    currentNode = currentNode.next;
    position++;
    }

    
}
return isFound;
}
/* 
//skip elements
void skipElemenst(){
    Node currentNode= this.head;
    int position =1;
    while(currentNode!=null){
        if(position%2==1){
            System.out.print(currentNode.data+" --> ");
            

        }
        currentNode = currentNode.next;
        position++;
    }

}*/

void skipElemenstss(){
    if (this.head == null) {
        System.out.println("List is empty");
        return;
    }
    System.out.println();
    Node currentNode= this.head;
    
    while(currentNode.next!=null){
        
            System.out.print(currentNode.data+" --> ");
            
        
        
        currentNode = currentNode.next.next;
        
        
    }

}
    

//deleteat startr

void deleteAtStart(){
    if(this.head == null){
        return;
    }
    //single and multiple node
    this.head = this.head.next;
    this.count--;
}


//delete at end

void deleteAtEnd(){
    if(this.head ==null){
        return;

    }
    //list has only one node
    if(this.head.next == null ){
        this.head = null;
        return;
    }
    Node currentNode= this.head;

    while(currentNode.next.next!=null){
        currentNode= currentNode.next;
    }
    currentNode.next = null;
    this.count--;
}

//delte at position
void deleteAtPosition(int position)
{
    if(position < 1 || position > this.count+1){
        System.out.println("Invalid position");
        return;
    }

    if(position == 1){
        this.deleteAtStart();
        return;
    }

    if(position == this.count){
        this.deleteAtEnd();
        return;
    }


    Node currentNode = this.head;
    int count =1;
    while(count<position-1){
        currentNode = currentNode.next;
    }

    currentNode.next= currentNode.next.next;
    this.count--;
}


void createLoop(){
    if(this.head==null){
        return;
    }

    Node currentNode= this.head;
    while(currentNode.next!=null){
        currentNode= currentNode.next;
    }
    currentNode.next = this.head;
}

boolean isLoop(){
    boolean isFound = false;
    if(this.head == null){
        return false;
    }
    //sinle node
    if(this.head.next == null){
        return false;
    }

    if(this.head.next ==this.head){
        return true;

    }
    Node slow = this.head;
    Node fast = this.head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            isFound= true;
            break;
           
        }
        
        
    }
    return isFound;
}

int getMiddleNodeValue(){
    
    if(this.head == null){
        return -1;
    }
    //sinle node
    if(this.head.next == null){
        return this.head.data;
    }

    
    Node slow = this.head;
    Node fast = this.head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        
        
    }
    return slow.data;
}



    
}
