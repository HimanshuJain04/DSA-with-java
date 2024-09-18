import java.util.*;

public class NQueensBackTrackingAllSolutions {

    public static boolean isSafe(char board[][],int r,int c) {

        // upper row
        for(int i=r-1;i>=0;i--){
            if(board[i][c]=='Q'){
                return false;
            }
        }    

        // diagonal left
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){

            if(board[i][j]=='Q'){
                return false;
            }
        }       

        // diagonal right
        for(int i=r-1,j=c+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }       
        
        return true;
    }

    public static ArrayList<String> createList(char board[][]) {

        ArrayList<String> arr=new ArrayList<String>();

        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board[i].length;j++){
                str+=board[i][j];
            }
            arr.add(str);
        }

        return arr;
        
    }

    public static int nQueens(char board[][],int row,ArrayList<ArrayList<String>> arr){

        if(row==board.length){
            // printBoard(board);
            arr.add(createList(board));  //add ans to final array
            return 1;
        }

        int ans=0;

        for(int j=0;j<board.length;j++){

            if(isSafe(board,row,j)){

                board[row][j]='Q';
                ans=ans+nQueens(board,row+1 , arr);
                board[row][j]='X';

            }
        }

        return ans;
        
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------Display----------");
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
                System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];

        ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0,arr);

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) +"   ");
            }
            System.out.println();
        }


        // nQueens(board,0,0);

    }
    
}
