object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var buy = 0
        var sell = 1
        
        var maxProfit = 0
        
        while(buy < sell && sell < prices.size){
            if(prices(buy) > prices(sell)){
                buy = sell
                sell += 1
            }else{
                val profit = prices(sell) - prices(buy)
                if(profit > maxProfit) {
                    maxProfit = profit
                }
                sell += 1
            }
        }
        
        maxProfit
    }
}
