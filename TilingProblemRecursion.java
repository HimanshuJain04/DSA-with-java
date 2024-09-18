public class TilingProblemRecursion {
    public static int tiling(int n){
        if(n==0 || n==1) return 1; 

        int total=tiling(n-1)+tiling(n-2);

        return total;
        
    }

    public static void main(String[] args) {
        System.out.print(tiling(4));
    }
    
}
