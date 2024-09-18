public class TargetSum {

    public static void printArr(int arr[]) {
        
    }

    public static int calcTarget(int arr[],int sum,int tar,int idx){


        if(idx==arr.length && tar==sum){
            // System.out.println(ans);
            return 1;
        }

        if(idx==arr.length) return 0;
        int ans=0;
        ans+=calcTarget(arr,sum+arr[idx],tar,idx+1);
        ans+=calcTarget(arr,sum-arr[idx],tar,idx+1);

        return ans;
        
    }

    public static void main(String[] args) {

        int arr[]={1};
        int tar=1;

        System.out.println(calcTarget(arr,0,tar,0));

        


    }
    
}
