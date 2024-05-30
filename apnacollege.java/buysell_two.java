public class buysell_two {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
 
       System.out.println( buy_Sell(arr));
 
 
     }static int buy_Sell(int arr[]){
         int profit = 0;
 
         //for loop foop buy price
         for(int i = 0; i < arr.length - 1;i++){
             for(int j = i + 1; j < arr.length;j++){
                 int buy = arr[i];
                 int sell = arr[j];
                 
                 if(sell > buy){
                     profit += sell - buy;
                     i = j;
                 }else if(arr[i] > arr[j]){
                     i = j;
                 }
                
             }
         
         }
        return profit;
     }
    
}
