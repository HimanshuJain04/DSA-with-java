import java.util.*;

public class SumofAllSubsetXORTotals {


    public static int  helper(ArrayList<Integer> arr){

        if(arr.size()==0) return 0;

       if (arr.size()==1) return arr.get(0);

       int sum=0;

       for(int i=0; i<arr.size();i++){
            sum=sum^arr.get(i);
       }
       return sum;
    }

    public static void printArray(ArrayList<Integer> arr){

        if(arr.size()==0){
            System.out.print("Empty");
        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
    }

    public static void callingMethod(int arr[],int idx,ArrayList<Integer> sum){

        if(idx==arr.length){
            printArray(sum);
            System.out.println(" => "+helper(sum));
            return;
        }

        sum.add(arr[idx]);
        callingMethod(arr,idx+1,sum);
        sum.remove(sum.size()-1);
        callingMethod(arr,idx+1,sum);
    }

    public static int sumOfAllXor(int arr[]){

        ArrayList<Integer> ans=new ArrayList<Integer>();
        callingMethod(arr,0,ans);
        return 0;
    }
    
    public static void main(String[] args) {

        int arr[] = {5,1,6};
        System.out.println( sumOfAllXor(arr));
        
    }
    
}
