public class RearrangeWordsInASentence {

    static void  printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();

    }

    public static String  arrangeWords(String text) {

        String arr[]=text.split(" ",Integer.MAX_VALUE);
        printArray(arr);


        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){

                if(arr[j].length()>arr[j+1].length()){
                    // swap
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArray(arr);

        text="";

        for(int i=0;i<arr.length;i++){
            if(i==0){
                text=text+arr[0].substring(0,1).toUpperCase()+arr[0].substring(1);
            }
            else{
                text=text+arr[i].toLowerCase();
            }
            text+=" ";
        }

        return text.trim();
        
    }

    public static void main(String[] args) {
        System.out.println(arrangeWords("Keep calm and code on"));
        
        
    }
    
}
