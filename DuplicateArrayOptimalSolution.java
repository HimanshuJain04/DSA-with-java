public class DuplicateArrayOptimalSolution {
    public static void main(String[] args) {
        
        int arr[]={2,5,9,6,9,3,8,9,7,1};

        int slow=arr[0];
        int fast=arr[0];

        do{
            slow=arr[slow];
            fast=arr[arr[fast]];

        }while(fast!=slow);

        fast=arr[0];

        while(fast!=slow){
            fast=arr[fast];
            slow=arr[slow];
        }

        System.out.println(fast);
        System.out.println(slow);
    }
    
}
