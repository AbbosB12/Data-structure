public class FactorialIterative {
    public static void main(String[] args) {
        int num=6;
        //6*5=30
        //30*4=120
        //120*3=360
        //360*2=720
        //System.out.println("Iterative - " + num+"!= " + factorial(num));
        System.out.println("Recursive - " + num+"!= " + factorialR(num));
    }
    public static long factorial(long num){
        if (num==0) return 1;
        int fact=1;
        for(int i=1;i<=num;i++) fact*=i;
         return fact;
    }
    public static long factorialR(long num){
        if (num==0) return 1;
        else return num * factorialR(num-1);
    }
}
