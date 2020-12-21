object Solution {
    def reverse(x: Int): Int = {
        if(x == 0){
            0
        }else{
            var output = 0L
            var num = x
            var flag = false
            
            if(x < 0){
                num = Math.abs(num)
                flag = true
            }
            
        
            while(num!=0){
                var mod = num%10
            
                output = (output*10) + mod
            
                num = num/10
            }
            
            val res = if(flag){
                output * (-1)
            }else{
                output
            }
            //To avoid overflow
            if(res < Int.MinValue || res > Int.MaxValue) 0 else res.toInt
        }
    }
}
