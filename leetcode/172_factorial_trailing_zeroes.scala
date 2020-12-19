object Solution {
    def trailingZeroes(n: Int): Int = {
        var count5 = 0
        var count2 = 0
        
        var temp = n
        while(temp>=5){
            count5 += temp/5
            temp = temp/5
        }
        
        temp = n
        while(temp>=2){
            count2 += temp/2
            temp = temp/2
        }
        
        if(count5 < count2) count5 else count2
    }
}
