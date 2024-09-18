public class SumOfFirstNTermRecursion {
    public static int sumPrint(int n) {
        if(n==1){
            return 1;
        }
        int sum=n+sumPrint(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        System.out.println(sumPrint(3));
        
        
    }
    
}
