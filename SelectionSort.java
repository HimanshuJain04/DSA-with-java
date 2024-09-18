// Time Complixity : O(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        for(int i=0;i<arr.length-1;i++){

            int smallest=i;

            for(int j=i+1;j<arr.length;j++){
                // find the minimum of unsorted array
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }

            // swap
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
