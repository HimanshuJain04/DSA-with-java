public class WateringPlants {
    public static void method1() {

        int arr[]={1,1,1,4,2,3};
        int cap=4;

        int currcap=cap;
        int steps=0;
        int i=0;

        while(i<arr.length){

            if(currcap>=arr[i]){

                steps++;
                currcap=currcap-arr[i];
                arr[i]=0;
                i++;

            } else {
                steps=steps+i;
                i=0;
                currcap=cap;
            }
        }

        System.out.println(steps);
        
    }
    public static void main(String[] args) {
        method1();
    }
    
}
