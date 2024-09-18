public class OccurenceOfNumberRecursion {
    public static void printOccurence(int arr[],int key,int n) {
        if(n==arr.length) return;
        else if(arr[n]==key) System.out.println(n);
        printOccurence(arr,key,n+1);

        
    }
    public static void main(String[] args) {
        int arr[] ={3,2,4,5,6,2,7,2,2};
        int key=2;
        printOccurence(arr,key,0);        
    }
    
}
