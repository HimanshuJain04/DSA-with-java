public class AddBinary {

    public static void main(String[] args) {
        String str1="111";
        String str2="111";

        AddString(str1,str2);
    }

    public static void AddString(String str1, String str2) {

        int i=str1.length()-1;
        int j=str2.length()-1;

        int c=0;

        String s="";

        while(i>=0 && j>=0){

            int d1=str1.charAt(i)-'0';
            int d2=str2.charAt(j)-'0';

            if(d1+d2+c==2){
                s="0"+s;
                c=1;
            } else if(d1+d2+c==3){
                s="1"+s;
                c=1;
            } else {
                s=(d1+d2+c)+s;
                c=0;
            }
            j--;
            i--;
        }

        while(i>=0){
            int d1=str1.charAt(i)-'0';
            if(d1+c==2){
                s="0"+s;
                c=1;
            }else {
                s=(d1+c)+s;
                c=0;
            }
            i--;
        }

        while(j>=0){
            int d2=str2.charAt(j)-'0';
            if(d2+c==2){
                s="0"+s;
                c=1;
            }else {
                s=(d2+c)+s;
                c=0;
            }
            j--;
        }

        if(c!=0){
            s=c+s;
        }

        System.out.println(s);
    }
    
}
