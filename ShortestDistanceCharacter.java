public class ShortestDistanceCharacter {

     public static void display(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }


     public static int[] shortestToChar(String s, char c) {

        int arr[]=new int[s.length()]; // intitially with 0;

        for(int i=0;i<s.length();i++){
            arr[i]=Integer.MAX_VALUE;
        }

        for(int i=0;i<s.length();i++){

            char curr=s.charAt(i);

            if(curr==c){

                for(int j=0;j<arr.length;j++){

                    int k=Math.abs(i-j);

                    if(arr[j]>k){
                        arr[j]=k;
                    }

                }

            }


            
        }
        display(arr);
        return arr;
    }

    public static void main(String[] args) {

         String s = "hello";
         char c = 'e';

        //  [1,0,1,2,3];

         shortestToChar(s,c);
         
        


    }
    
}
