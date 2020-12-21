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

//Better solution: in the above solution we are only decreasing the range on 1 side by half, but other side by only 1 number
//This solution decreases by half for both side (binary search pattern)

object Solution {
    def mySqrt(x: Int): Int = {
        if(x == 0){
            0
        }else if(x == 1){
            1
        }else{
            var start = 1
            var end = x
            var result = 0
            
            while(start <= end){
                var mid = start + (end - start)/2
                if(mid <= x/mid){
                    result = mid
                    start = mid+1
                }else{
                    end = mid-1
                }
            }
            result
        }
    }
}
