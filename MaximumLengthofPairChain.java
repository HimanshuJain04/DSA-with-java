import java.util.*;
import java.util.Arrays;

class MaximumLengthofPairChain{
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,3},{3,4}};
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int last=arr[0][1];
        int c=1;

        for(int i=1;i<arr.length;i++){
            if(last<arr[i][0]){
                last=arr[i][1];
                c++;

            }
        }
        System.out.println(c);




        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");

        //     }
        //     System.out.println();
        // }
    }
}