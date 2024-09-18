public class QuickSort {
    
    public static void quickSort(int arr[],int start,int end) {

        if(start>=end) return;

        // Correct pivot index
        int pivIndex=partition(arr,start,end);
        quickSort(arr,start,pivIndex-1);
        quickSort(arr,pivIndex+1,end);

        
    }
    private static int partition(int[] arr, int start, int end) {

        int piv=arr[end];
        int i=start-1;

        for(int j=start;j<end;j++){
            if(piv>=arr[j]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=piv;
        arr[end]=arr[i];
        arr[i]=temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
