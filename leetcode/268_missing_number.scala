object Solution {
    def missingNumber(nums: Array[Int]): Int = {
        val size = nums.size
        val idealSum = (size * (size + 1))/2
        
        val arraySum = nums.foldLeft(0)(_ + _)
        
        idealSum - arraySum
    }
}
