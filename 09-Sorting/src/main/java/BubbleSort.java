public class BubbleSort {
    public static int[] bubbleSort( int[] array){
        for (int i=0; i<array.length; i++) {
            boolean swap=false;
            for (int n=0;n<array.length-1-i;n++) {
                if(array[n]>array[n+1]) { swap (array, n, n+1); swap=true;}

            }
            if (!swap) return array;
        }
        return array;
    }
    public static void swap(int[] array, int idx1,int idx2){
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]= temp;
    }

}
