import java.util.ArrayList;

public class WinnerCircularGame {

    public static void method1() {
        int n=5;
        int k=2;
        // output is 3

        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=1;i<=n;i++){
            arr.add(i);
        }

        // 1  2  3  4  5  6   || k=5
        // 1  2  3  4  6   
        // 1  2  3  6   
        // 1  2  3   
        // 1  3   
        // 1  


        int j=0;

        while(arr.size()!=1){

            for(int i=1;i<k;i++){

                if(j==arr.size()-1){
                    j=0;
                } else{
                    j++;
                }
            }

            arr.remove(arr.get(j));

            if(j==arr.size()){
                j=0;
            }
        }   

        System.out.println(arr.get(0));
        
    }

    public static void method2() {

        int n=3;
        int k=2;

        // 1  2  3 
        // 1  3
        // 1

        
    }
    public static void main(String[] args) {
method1();
       
    }
    
}
