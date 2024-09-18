public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};

        int buy=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<prices.length;i++){

            if(buy<prices[i]){

                if(max<prices[i]-buy){
                    max=prices[i]-buy;
                }

            } else {
                buy=prices[i];
            }
        }
        System.out.print(max);
    }
    
}
