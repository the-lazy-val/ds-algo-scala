object Solution {
    def rob(nums: Array[Int]): Int = {
        if(nums.length == 0){
            0
        }else if(nums.length == 1){
            nums(0)
        }else if(nums.length == 2){
            Math.max(nums(0), nums(1))
        }else{
            Math.max(
                nums(0) + rob(nums.drop(2)),
                nums(1) + rob(nums.drop(3))
            )
        }
    }
}

//The above solution worked for small input arrays
//but had MEMORY LIMIT EXCEEDED for large input

//While using DP: we try to store values of repetitive calculations
object Solution {
    def rob(nums: Array[Int]): Int = {
        if(nums.length == 0){
            0
        }else{
            var dp = Array.fill(nums.length+1)(0)
            
            dp(0) = 0
            dp(1) = nums(0)
            (1 to nums.length-1).map(i => {
                dp(i+1) = Math.max(dp(i), dp(i-1) + nums(i))
            })
            
            dp(nums.length)
        }
    }
}

//Another way to do the same
object Solution {
    def rob(nums: Array[Int]): Int = {
        if(nums.isEmpty){
            0
        }else{
            var rob = nums(0)
            var no_rob = 0
            var prev = rob
            for(i <- 1 until nums.length){
                prev = rob
                rob = no_rob + nums(i)
                no_rob = Math.max(prev, no_rob)
                
            }
            Math.max(no_rob, rob)
        }
    }
}
