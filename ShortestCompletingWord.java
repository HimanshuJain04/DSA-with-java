public class ShortestCompletingWord {

    public static boolean isSame(String curr,String str){

        for(int i=0;i<str.length();i++){

            if(curr.contains(str.substring(i,i+1))){

                int idx=curr.indexOf(str.substring(i,i+1));
                curr=curr.substring(0,idx)+curr.substring(idx+1);

            }else{
                return false;
            }
        }



        return true;
    }

    public static String shortestWord(String str, String[] arr) {

        // str into simple terms
        String s="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                s=s+str.charAt(i);
            }
        }
        s=s.toLowerCase();
        
        
        String ans="";
        int len=Integer.MAX_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
            
            String curr=arr[i];
            
            if(isSame(curr,s) && curr.length()<len ){
                System.out.println(arr[i]);
                ans=curr;
                len=curr.length();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="1s3 456";
        String words[]={"looks","pest","stew","show"};

        System.out.println("Answer = "+shortestWord(str,words));
        
    }
    
}
