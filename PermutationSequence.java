public class PermutationSequence {
    
    public static void permutation(String str,String s,int k,int n){

        if(str.length()==0){

            System.out.println(s +"  "+n);
            
            return;
        }
        
        for(int i=0;i<str.length();i++){
            
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permutation(newstr,s+curr,k,n);
        }
    }

    public static void main(String[] args) {
        int n=3;
        int k=3;

        String str="";

        for(int i=1;i<=n;i++){
            str+=i;
        }

        permutation(str,"",k,1);

    }
    
}
