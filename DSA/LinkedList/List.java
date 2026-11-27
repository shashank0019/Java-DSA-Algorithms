package LinkedList;

public class List {
    public static void main(String[] args) {

        SinglyLinkedList singleList = new SinglyLinkedList();
        SinglyLinkedList luckyNumbers = new SinglyLinkedList();


       // singleList.printAllNodes();

       // singleList.insertAtStart(101);
       // singleList.printAllNodes();

        luckyNumbers.insertAtStart(10);
        luckyNumbers.printAllNodes();
        /*singleList.insertAtStart(102);
        singleList.printAllNodes();
        singleList.insertAtStart(103);

        singleList.printAllNodes();*/
        luckyNumbers.insertAtStart(20);
        luckyNumbers.printAllNodes();
        luckyNumbers.insertAtStart(30);
        luckyNumbers.printAllNodes();
        luckyNumbers.insertAtStart(40);
        luckyNumbers.printAllNodes();

        luckyNumbers.insertAtEnd(1);
        luckyNumbers.printAllNodes();
        luckyNumbers.insertAtPostion(50,2);
        luckyNumbers.printAllNodes();
        luckyNumbers.insertAtPostion(70,6);
        luckyNumbers.printAllNodes();
        luckyNumbers.insertAtPostion(80,3);
        luckyNumbers.printAllNodes();

        luckyNumbers.search(1);
        luckyNumbers.printAllNodes();


        luckyNumbers.deleteAtStart();
        luckyNumbers.printAllNodes();
        luckyNumbers.deleteAtEnd();
        luckyNumbers.printAllNodes();
    //    luckyNumbers.deleteAtPosition();
    //    luckyNumbers.printAllNodes();


       // luckyNumbers.skipElemenst();
      // luckyNumbers.skipElemenstss();
      luckyNumbers.createLoop();
      //luckyNumbers.printAllNodes();
      boolean result = luckyNumbers.isLoop();
      System.out.println(result);
      
        
        

        
    }
}