// import java.util.*;
import java.lang.Math;

public class EWNS_Direction {
    public static void main(String[] args) {
        String st="WNEENESENNN";

        int x=0;
        int y=0;

        for(int i=0;i<st.length();i++){
            char curr=st.charAt(i);
            if(curr=='E'){
                x++;
            } else if (curr=='W'){
                x--;
            } else if (curr=='N'){
                y++;
            } else if (curr=='S'){
                y--;
            }

        }

        int ans=(int)Math.pow(x,2)+(int)Math.pow(y,2);

        System.out.println(Math.sqrt(ans));
    }
    
}
