// Time complexity is O(n).


// This is valid only for positives arrays

public class MaxSubArraySumByKadane {

    public static void solutionByKadane(int arr[]){

        int max=Integer.MIN_VALUE;
        int current=0;

        for(int i=0;i<arr.length;i++){
            
            current=current+arr[i];

            if(current<0){
                current=0;
            }

            if(max<current){
                max=current;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};

        solutionByKadane(arr);
    }
    
}
