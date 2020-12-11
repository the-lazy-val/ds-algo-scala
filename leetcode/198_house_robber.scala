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
