public class ShortestPalindrome {

    public static void makePalindrome(String str){

        int i=0;
        int j=str.length()-1;

        while(i<=j){

            // if(i==j){
            //     str=str.substring(0, i)+str.charAt(i)+str.substring(i);
            // }

            if(str.charAt(i)!=str.charAt(j)){

                str=str.substring(0,i)+str.charAt(j)+str.substring(i);
                // System.out.println(str);
                j++;
            }
            
            i++;
            j--;

        }

        System.out.println(str);
        
    }
    public static void main(String[] args) {

        String s = "aabba";
        makePalindrome(s);
    }
    
}
