public class StringSubsetBackTracking {

    public static int count=0;

    public static void subSet(String str,String ans,int i) {

        if(i==str.length()){
            count++;
            System.out.println(ans);
            return;
        } 

        // Yes->
        subSet(str,ans+str.charAt(i),i+1);
        // NO->
        subSet(str,ans,i+1);

        
    }

    public static void main(String[] args) {
        String str="abc";
        
        subSet(str,"",0);
        System.out.println(count);
    }
    
}
