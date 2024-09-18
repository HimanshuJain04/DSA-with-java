public class NumberToWord {

    public static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printWord(int num) {
        if(num<10){
            System.out.print(arr[num]+" ");
            return;
        }
        
        // kaam
        printWord(num/10);
        System.out.print(arr[num%10]+" ");
        
    }
    public static void main(String[] args) {
        int num=1029;
        printWord(num);
        
    }
    
}
