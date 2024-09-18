public class CountingSort {
    public static void main(String[] args) {

        int arr[]={5,4,1,3,2,7};

        // Find the largest element of array
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }

        // create an array
        int newarr[]=new int[lar+1];

        // frequency of number
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<newarr.length;i++){
            while(newarr[i]>0){
                arr[j]=i;
                newarr[i]--;
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



        // System.out.println(lar);
    }
    
}
