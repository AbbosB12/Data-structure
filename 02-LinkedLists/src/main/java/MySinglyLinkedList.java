public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;


    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head==null;
    }

//Adds element into last position in the linked list
    void add(int data){
        //create a new node with data value
        Node node= new Node(data);
        //check if empty
        if(isEmpty()){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }


    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null)
                System.out.print(current.value + "=> null");
             else
                System.out.print(current.value + "=>");
                current = current.next;

        }
    }
    void deleteNode() {

    }



    int indexOf(int value){
        int pos=0;
        Node current=head;
        if(isEmpty())
            return -1;
        while (current!=null){
            if(current.value==value)
                return pos;
            pos++;
            current=current.next;
        }
       return -1;
    }
}
