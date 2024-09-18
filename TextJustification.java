//  68--> LeetCode


import java.util.*;

public class TextJustification {

    public static String addingSpaces(String str,boolean last) {

        // code this areaa--->>

        if(str.length()==15){
            return str;
        }
        




        return str;
    }

    public static void main(String[] args) {

        String words[] = {"This", "is", "an", "example", "of", "text", "justification."};
        // String words[] = {"What","must","be","acknowledgment","shall","be"};
        int mw= 16;

        List<String> arr=new ArrayList<>();

        int i=0;
        boolean last=false;

        
        while(i<words.length){

            String curr=words[i];
            
            String str="";
            
            while(str.length()+curr.length()<=mw && i<words.length){

                str=str+curr+" ";
                i++;

                if(i<words.length) {
                    curr=words[i];
                } else {
                    last=true;
                }

            }

            // Raw string with no in between extra space but we have to trim extra ending spaces

            System.out.println(str +"   "+str.length());

            arr.add(addingSpaces(str,last));

        }

        System.out.println("------Display the List-------");

        for(String s:arr){
            System.out.println(s);
        }

        
    }

    
}
