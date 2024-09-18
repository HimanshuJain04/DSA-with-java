// Time Complexity for this solution is O(n^3).


public class MaxSubArraySumByBrute {

    public static void solutionByBrute(int arr[]){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    if(max<sum){
                        max=sum;
                    }
                }

            }
        }

        System.out.println(max);
    }


    public static void main(String[] args) {

        int arr[]={-2,-3,4,-1,-2,1,5,-3};

        solutionByBrute(arr);
    }
    
}
