public class AlgoQuestion2PrintMiddleNode {
    public static void main(String[] args) {
    MySinglyLinkedList sll= new MySinglyLinkedList();
    for (int i=1; i<11; i++){
        sll.add(i);
    }
    sll.printNodes();
    System.out.println();
    printMiddle(sll);
    }
    public static void printMiddle(MySinglyLinkedList sll){
        if (sll.isEmpty())
            throw new IllegalArgumentException();
        var singleJump=sll.head;
        var doubleJmp=sll.head;

        while (doubleJmp !=sll.tail && doubleJmp.next!=sll.tail){
            singleJump=singleJump.next;
            doubleJmp=doubleJmp.next.next;
        }
        if(doubleJmp==sll.tail)
            System.out.println(singleJump.value);
        else
            System.out.println(singleJump.value + ","+singleJump.next.value);
    }
}
