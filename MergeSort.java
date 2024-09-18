public class MergeSort {

    public static void merge(int arr[],int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=0;

        int temp[]=new int[end-start+1];

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            } else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // left part
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }

        // right part
        while(j<=end){
            temp[k]=arr[j];
            k++;
            j++;
        }

        // copy temp array to original array
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        
    }
    public static void divide(int arr[],int start,int end){

        if(start>=end) return;

        // int mid=(start+end)/2;  both are equal
        int mid=start+(end-start)/2;

        divide(arr,start,mid); // left 
        divide(arr,mid+1,end);  // right
        merge(arr,start,mid,end); 
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        divide(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
