object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        if(nums.length == 1){
            nums(0)
        }else{
            var sum = nums(0)
            var max = nums(0)
            var i = 1
            while (i < nums.length){
                val elem = nums(i)
                sum = sum + elem
                if(sum > max){
                    max = sum
                    i += 1
                }else if(sum < elem){
                    sum = elem
                    i += 1
                }else{
                    i += 1
                }
                
                if(elem > max){
                    max = elem
                    sum = elem
                }
            }
            max
        }
    }
}
