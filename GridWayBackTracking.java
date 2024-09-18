public class GridWayBackTracking {

    // private static int count=0;

    public static int gridWay(int row,int col,int i,int j) {

        if(i==row-1 && j==col-1){
            return 1;
        } else if(i==row || j==col){
            return 0;
        }

        return (gridWay(row,col,i+1,j)+gridWay(row,col,i,j+1));
    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        System.out.print(gridWay(r,c,0,0));
    }
    
}
