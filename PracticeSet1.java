public class PracticeSet1 {

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void print2DArr(String arr[][]) {
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
             System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println();
    }

    // 1-d array

    public static int binarySearchRecursion(int arr[],int start,int end,int key){
        if(start>end){
            return -1;
        }

        int mid=(start+end)/2;
        
        if(arr[mid]==key){
            return mid;

        } else if (arr[mid]<key){
            return binarySearchRecursion(arr,mid+1,end,key);

        } else if(arr[mid]>key) {
            return binarySearchRecursion(arr, start, mid-1, key);
        }
        return -1;
    }

    public static int binarySearchWhile(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
    
            } else if (arr[mid]<key){
                start=mid+1;
    
            } else if(arr[mid]>key) {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void maxSubArraySumBrute(int arr[]){

        int max=-1;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }

                if(max<sum){
                    max=sum;
                }
            }
        }

        System.out.println(max);
    }

    public static void maxSubArraySumPrefix(int arr[]){

        int dummy[]=new int[arr.length];

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            dummy[i]=sum;
        }
        int max=dummy[0];

        for(int i=0;i<arr.length;i++){

            if(max<dummy[i]) max=dummy[i];

            for(int j=i+1;j<arr.length;j++){

                if(max<(dummy[j]-dummy[i])){
                    max=dummy[j]-dummy[i];
                }
            }
        }
        System.out.println(max);
    }
    
    public static void maxSubArraySumKadane(int arr[]){
        int max=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];

            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }

        System.out.println(max);
    }

    // Sorting------>

    public static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }

    public static void selectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            // swapping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        printArr(arr);
    }


    public static void insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            int curr=arr[i];
            int j=i-1;

            while(arr[j]>curr && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=curr;

        }

        printArr(arr);
    }


    public static void countingSort(int arr[]){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }

        int temp[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }

        int idx=0;
        for(int i=0;i<temp.length;i++){

            if(temp[i]>0){

                for(int k=0;k<temp[i];k++){
                    arr[idx]=i;
                    idx++;
                }
            }
        }
        printArr(arr);
    }


    //   <<<--------------------------- Quick-Sort------------------------->>>

    public static int giveMeIndex(int arr[],int idx){

        int i=-1;

        for(int j=0;j<idx;j++){

            if(arr[i]>=arr[idx]){
                i++;
                // swap
                
            }

        }
        



        return 1;

    }
    
    public static void quickSort(int arr[],int strt,int end){


        
    }


    //   <<<--------------------------- End Quick-Sort------------------------->>>


    //   <<<--------------------------- Merge-Sort------------------------->>>

    public static void merge(int arr[],int strt,int mid,int end){

        int newarr[] = new int[end-strt+1];

        int idx=0;
        int i=strt;
        int j=mid+1;

        while(i<=mid && j<=end){

            if(arr[i]<arr[j]){
                newarr[idx]=arr[i];
                i++;
            } else {
                newarr[idx]=arr[j];
                j++;
            }
            idx++;
        }

        while(i<=mid){
            newarr[idx]=arr[i];
            i++;
            idx++;
        }

        while(j<=end){
            newarr[idx]=arr[j];
            j++;
            idx++;
        }

        // copy newarray to old array

        for(i=0,j=strt;i<newarr.length;i++,j++){
            arr[j]=newarr[i];
        }

    }
    
    public static void mergeSort(int arr[],int strt,int end){

        if(strt>=end){
            return;
        }
        
        int mid=(strt+end)/2;
        
        mergeSort(arr, strt, mid);
        mergeSort(arr, mid+1,end);
        merge(arr, strt, mid, end);
        // printArr(arr);

    }

        //   <<<---------------------------End Merge-Sort------------------------->>>

        // <<--------------  n-queens start ---------------->>

        private static boolean isValid(String arr[][],int row,int col) {

            // Downward-Row or column-wise
            for(int i=row;i>=0;i--){
                if(arr[i][col]=="Q") return false;
            }

            // left-diagonal
            for(int i=row,j=col;i>=0 && j>=0;i--,j--){
                if(arr[i][j]=="Q")return false;
            }

            // right-diagonal
            for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
                if(arr[i][j]=="Q")return false;
            }
            return true;
        }

        public static void nQueens(String arr[][],int row) {

            if(row==arr.length){
                print2DArr(arr);
                return;
            }

            for(int i=0;i<arr.length;i++){

                
                if(isValid(arr,row,i)){
                    arr[row][i]="Q";
                    nQueens(arr, row+1);
                    arr[row][i ]="X";
                }
            }
        }
        // <<--------------  n-queens end ---------------->>

        // Permutations

        public static void permutations(String str,String ans){

            if(str.length()==0){
                System.out.println(ans);
                return;
            }

            for(int i=0;i<str.length();i++){
                String newStr = str.substring(0,i)+str.substring(i+1);
                permutations(newStr, ans+str.charAt(i));
            }


        }




    public static void main(String[] args) {

        // int arr[]={-4,-2,6,9,1,-3,1};
        // int arr[]={1,5,2,4,1};
        // String str="himanshu";

        // System.out.println(binarySearchWhile(arr, 3));
        // System.out.println(binarySearchRecursion(arr, 0, arr.length-1, 37));
        // maxSubArraySumBrute(arr);
        // maxSubArraySumPrefix(arr);
        // maxSubArraySumKadane(arr);
        // bubbleSort(arr);
        // countingSort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        // mergeSort(arr,0,arr.length-1);
        // quickSort(arr,0,arr.length-1);
        // printArr(arr);

        // String arr[][]={{"X","X","X","X"},
        //                 {"X","X","X","X",},
        //                 {"X","X","X","X",},
        //                 {"X","X","X","X",}};

        // nQueens(arr,0);

        permutations("12", "");



    }
    
}
