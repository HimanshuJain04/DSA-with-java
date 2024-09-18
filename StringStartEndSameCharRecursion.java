public class StringStartEndSameCharRecursion {
    public static int count=0;

    public static void printString(String str,int start,int end){

        if(start==str.length() && end==str.length()){
            System.out.print(count);
            return;

        } else if(end==str.length()){
            start++;
            end=start;
        } else {

            String sub=str.substring(start,end+1);
    
            if(sub.charAt(0)==sub.charAt(sub.length()-1)){
                count++;
            }
            end++;
        }

        printString(str,start,end);

        
    }

    public static void main(String[] args) {
        // String str="abcab";
        String str="a";
        printString(str,0,0);
        
    }
    
}
