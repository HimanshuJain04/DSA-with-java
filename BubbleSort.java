public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={0,1,5,2};

        for(int i=0;i<arr.length-1;i++){

            boolean swap=true;


            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swap=false;
                }
            }
            if(swap){
                System.out.println("Sorted");
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
