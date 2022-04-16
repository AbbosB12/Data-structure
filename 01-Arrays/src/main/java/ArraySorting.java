import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        char[]array = {'w','e','a','l','k'};
        System.out.println(Arrays.toString(array));
       arraySort(array);
    }
    public static void arraySort(char[] data){
        int n=data.length;

        for (int k=1; k<n; k++){
            char cur=data[k];
            int j=k;
            while (j>0 && data[j-1] >cur){
                data[j]=data[j-1];
                j--;
            }
            data[j]=cur;
        }
        System.out.println(Arrays.toString(data)); // O(n^2)
    }
}
