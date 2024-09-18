public class ReverseInteger {
    public static void reverse(int num) {

        String s="";

        while(num>0){
            s+=num%10;
            num=num/10;
        }

        while(s.startsWith("0")){
            s=s.substring(1);
        }

        long val=Long.parseLong(s);

        if(val>Integer.MAX_VALUE){

            System.out.println("Invalid value");

        } else {

            System.out.println("Value: " + val);

        }

        // System.out.println(s);
        
    }

    public static void main(String[] args) {

        int num=-123;
        reverse(num);
        
    }
    
}
