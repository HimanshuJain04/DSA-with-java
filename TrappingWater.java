// Time complixity is O(n).

public class TrappingWater {

    
    public static void helper(int arr[],int left[],int right[]) {

        // for left array
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }

        // for right array

        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        // Display the arrays

        // for(int i=0;i<left.length;i++){
        //     System.out.print(left[i]+" ");
        // }

        // System.out.println();

        // for(int i=0;i<right.length;i++){
        //     System.out.print(right[i]+" ");
        // }
        
    }
    public static void main(String[] args) {

        int arr[]={4,2,0,6,3,2,5};

        int leftBoundry[]=new int[arr.length];
        int rigthBoundry[]=new int[arr.length];

        helper(arr,leftBoundry,rigthBoundry);

        int water=0;

        for(int i=0;i<arr.length;i++){

           int min = Math.min(leftBoundry[i],rigthBoundry[i]);
           int add=min-arr[i]<0 ? 0: min-arr[i];

           water=water+add;
        }

        System.out.println(water);


    }
    
}
