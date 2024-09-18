// Time Complexity is O(n^2)

class MaxSubArraySumByPrefix{

    public static void solutionByPrefix(int arr[]){

        int max=Integer.MIN_VALUE;

        int newarr[]=new int [arr.length];

        // initialize the new array

        newarr[0]=arr[0];
        for(int i=1;i<newarr.length;i++){
            newarr[i]=newarr[i-1]+arr[i];
        }

        // check for maximum sum

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<newarr.length;j++){

                sum= i==0 ? newarr[j] :newarr[j]-newarr[i];

                if(max<sum){
                    max=sum;
                }
            }
        }

        System.out.println(max);



    }
    public static void main(String[] args) {

        int arr[]={1,-2,6,-1,3};

        solutionByPrefix(arr);

        
    }
}