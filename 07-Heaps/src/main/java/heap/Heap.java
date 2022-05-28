package heap;

public class Heap {

    private Node[] heapArr;
    private int maxSize; //size of array
    private int currentSize;//number of nodes in array

    public Heap(int mx){
        maxSize=mx;
        currentSize=0;
        heapArr=new Node[maxSize]; //create array
    }


}
