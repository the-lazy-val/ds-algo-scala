object Solution {
    def mySqrt(x: Int): Int = {
        if(x == 0){
            0
        }else if(x == 1){
            1
        }else{
            var num: Int = x/2
            var flag = true
            
            while(flag){
                // val sqr = num*num
                // if(sqr == x)
                
                //If we do num*num it may exceed Int range
                //Since we want to check: num*num < x
                //we can instead do num < x/num
                
                if(num > x/num){
                    num = num/2
                }else{
                    val temp = num + 1
                    if(temp > x/temp){
                        flag = false
                    }else{
                        num += 1
                    }
                }
            }
            num
        }
    }
}
