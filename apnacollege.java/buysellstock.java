public class buysellstock {

    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};
        int profit = 0;
        

        //checking from ith to buying
        for(int i = 0; i < stock.length;i++){
            int buy = stock[i];
            //checking for selling
            for(int j = i + 1; j < stock.length;j++){
                int sell = stock[j];
                int now_profit = sell -buy;
                System.out.println(now_profit);
                profit = Math.max(profit, now_profit);
            }
        }
        System.out.println(profit);
    }
    
}
