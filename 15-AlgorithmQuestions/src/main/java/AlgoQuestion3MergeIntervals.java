import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoQuestion3MergeIntervals {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
        int[][] array={{1,2},{3,5},{4,7},{6,8},{9,10}};
        long start = System.currentTimeMillis();
        System.out.println(Arrays.deepToString(mergeIntervals(array)));
        long end = System.currentTimeMillis();
        System.out.println("execution time : " + (end-start) + " ms");
    }
    public static int[][] mergeIntervals(int[][] intervals){
        int[][] sortedIntervals=intervals.clone();
        Arrays.sort(sortedIntervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int[] currentInterval=sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for(int[] nextInterval:sortedIntervals){
            int currentIntervalEnd=currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd=nextInterval[1];

            if (currentIntervalEnd>=nextIntervalStart){
                currentInterval[1]=Math.max(currentIntervalEnd, nextIntervalEnd);
            } else{
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        //Total O(nlog(n) + O(n) ) ==> O(nlog(n) )
    }
}
