public class NthFibonacciNumberRecursion {
    public static int nthFibonacci(int n) {

        if(n==1){
            return 0;
        } else if(n==2){
            return 1;
        }

        int fib=nthFibonacci(n-1)+nthFibonacci(n-2);

        return fib;
        
    }
    public static void main(String[] args) {
        System.out.println( nthFibonacci(9));
       
        // 0 1 1 2 3 5 8 13 21......
    }
    
}
