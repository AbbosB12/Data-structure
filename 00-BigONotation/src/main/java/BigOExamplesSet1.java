public class BigOExamplesSet1 {
    public static void main(String[] args) {

        // F - Functional is any number.
        // c0 - constant like final(we don't care about c) we care about only n high number
        // n- 2^2, 3^3
        // n^2 == n*2
        //   F(n)= c0+2n^2+3n^3=   O(n^3)
        int n=10000;
        int m=100;
        System.out.println("Input size n is = "+ n);
        // Task 1 Single Loop...................
        long startTime=System.currentTimeMillis();
        int numberOfOperations=0;
        for(int i=0;i<n;i++){
            numberOfOperations++;
        }// n+ n^2 + n^3 =23153  O(n^3)
        long endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #1 O(n)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 1 End...................
        // ......................................................................................................
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                numberOfOperations++; //C^9+n+ n^2+n^3 + n^4= O(n^3)
            // n
            // n* n
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #2 O(n^2)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................
        startTime=System.currentTimeMillis();
        long numberOfOperations2= (long) 0.0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++)
                    numberOfOperations2++;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #3 O(n^3) = "+ numberOfOperations2 + " in "+ (endTime-startTime));
        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                numberOfOperations++;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #4 O(nxm)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 4 End...................

       startTime=System.currentTimeMillis();
       numberOfOperations=0;
        for(int i=1;i<=n;i=i*2){
            numberOfOperations++;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #5 O(log n)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 5 End...................
    }
}