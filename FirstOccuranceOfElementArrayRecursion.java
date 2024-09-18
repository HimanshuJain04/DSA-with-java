public class FirstOccuranceOfElementArrayRecursion {
    public static void fistOccurance(int arr[],int i,int key) {
        if(i==arr.length){
            System.out.println("Key not Found");
            return;
        }
        else if(arr[i]==key){
System.out.println("Index is : "+i);
return;
        }
        fistOccurance(arr,i+1,key);

        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,9,5};
        fistOccurance(arr,0,1);
    }
    
}
