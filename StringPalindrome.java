public class StringPalindrome {
    public static void main(String[] args) {
        String str="racecar";
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Equal");
                break;
            }
            i++;
            j--;
        }
    }
    
}
