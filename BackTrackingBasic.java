class BackTrackingBasic{

    public static void assignValue(int arr[],int n) {

        if(n==arr.length) return;

        arr[n]=n+1;
        assignValue(arr,n+1);
        arr[n]=arr[n]-2;
        
    }
    public static void main(String[] args) {

        int arr[]=new int[5];

        assignValue(arr,0);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}