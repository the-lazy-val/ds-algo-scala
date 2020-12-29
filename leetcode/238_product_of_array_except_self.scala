object Solution {

    //pre-compute prefix & suffix products in O(N) time and then multiply them
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        var prefix = Array.fill(nums.length)(1)
        var suffix = Array.fill(nums.length)(1)
        
        (1 until prefix.length).map(i => {
            prefix(i) = prefix(i-1)*nums(i-1)
        })
        
        (suffix.length-2 to 0 by -1).map(i => {
            suffix(i) = suffix(i+1)*nums(i+1)
        })
        
        (0 until nums.length).map(i => {
            nums(i) = prefix(i) * suffix(i)
        })
        nums
    }
}
