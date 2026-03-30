public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2,3};

        System.out.println(bestTimeToBuyAndSellStock(prices));
    }
    
    public static int bestTimeToBuyAndSellStock(int[] prices){
        int cheaper = prices[0];
        int maxProfit = 0;

        for(int i=1; i < prices.length; i++){
            
            if(cheaper > prices[i]){
                cheaper = prices[i];
            }else{
                if(maxProfit < (prices[i] - cheaper)){
                    maxProfit = prices[i] - cheaper;
                }
            }
        }
        return maxProfit;
    }
}
