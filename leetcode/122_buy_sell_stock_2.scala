object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var buy = 0
        var sell = 1
        var profitNow = 0
        var maxProfit = 0
        var maxSell = 0
        
        var buyPrice = 0
        var sellPrice = 0
        
        while(buy < prices.size && sell < prices.size){
            
            buyPrice = prices(buy)
            sellPrice = prices(sell)
            
            if(buyPrice < sellPrice && sellPrice >= maxSell){
                maxSell = sellPrice
                profitNow = sellPrice - buyPrice
                sell += 1
            }else{
                maxProfit += profitNow
                maxSell = 0
                profitNow = 0
                buy = sell
                sell += 1
            }
        }
        
        if(maxProfit == 0) profitNow else maxProfit + profitNow
    }
}

//Alternate solution
object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        prices
            .foldLeft(0,Int.MaxValue)((t, current) => (t._1 + 0.max(current-t._2), current))
            ._1
    }
}
