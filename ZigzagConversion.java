public class ZigzagConversion {

    public static void upToDown(char arr[][],String str){

        int idx=0;
        int row=0;
        int col=0;

        while(idx<str.length()){

            // Up To Down

            for(int i=0;i<arr.length;i++){

                if(idx>=str.length()){
                    break;
                }

                arr[i][col]=str.charAt(idx);
                row++;
                idx++;
            }

            col++;
            row--;

            // Diagonal

            for(int i=0;i<row-2;i++){

                if(idx>=str.length()){
                    break;
                }

                arr[row][col]=str.charAt(idx);
                idx++;
                row--;
                col++;
            }

        }
        printArr(arr);




    }

    public static void printArr(char arr[][]){
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        
    }

    public static void convertString(String str,int row){

        char arr[][]=new char[row][str.length()-row];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]='-';
            }
        }

        printArr(arr);
        
        upToDown(arr,str);

        // printArr(arr);






    }

    public static void main(String[] args) {

        String s ="PAYPALISHIRING";
        int row=5;

        convertString(s,row);
    }
    
}
