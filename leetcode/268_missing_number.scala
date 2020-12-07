object Solution {
    def missingNumber(nums: Array[Int]): Int = {
        val size = nums.size
        val idealSum = (size * (size + 1))/2
        
        val arraySum = nums.foldLeft(0)(_ + _) // can also use nums.sum
        
        idealSum - arraySum
    }
}

//Removing foldLeft improved time
object Solution {
    def missingNumber(nums: Array[Int]): Int = {
        val size = nums.size
        var idealSum = (size * (size + 1))/2
        
        for(num <- nums){
            idealSum -= num
        }

        idealSum
    }
}
