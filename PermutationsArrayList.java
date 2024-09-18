// 46th question mark

import java.util.ArrayList;
import java.util.List;

public class PermutationsArrayList {

    public static void printArr(List<Integer> arr) {
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }


    // public static void print2DArr(String arr[][]) {
    //     for(int i=0;i<arr.length;i++){
    //        for(int j=0;j<arr[0].length;j++){
    //          System.out.print(arr[i][j]+" ");
    //        }
    //        System.out.println();
    //     }
    //     System.out.println();
    // }


    public static void permute(int[] nums,ArrayList<Integer> sol) {

        if(nums.length==0){
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
        }
        
    }

    public static void main(String[] args) {

        int arr[] = {1,2};
        permute(arr,new ArrayList<Integer>());
        
    }
}
