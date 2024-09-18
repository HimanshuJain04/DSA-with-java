import java.util.*;

public class CombinationalSum {

    public static void printAllSolution(int arr[],int tar,ArrayList<Integer> currComb,ArrayList<ArrayList<Integer>> ans,int idx,int currSum) {

        if(currSum==tar){
            ans.add(currComb);
            return;
        } 

        if(currSum>tar) {
            return;
        }

        for(int i=idx;i<arr.length;i++){

            currComb.add(arr[i]);
            currSum+=arr[i];

            printAllSolution(arr,tar,currComb,ans,i,currSum);

            currSum-=arr[i];
            currComb.remove(i);

        }
    }

    public static void main(String[] args) {

        int arr[]={1,2};
        int tar=4;
        ArrayList<Integer> currComb=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

        printAllSolution(arr,tar,currComb,ans,0,0);

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
            
        }

    }
    
}
