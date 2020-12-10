object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var map = Map.empty[Int, Int]
        var result = Array.empty[Int]
        (0 until nums.length) foreach { i =>
            val v = nums(i)
            map.get(target - v) match {
                case Some(x)  =>
                    if (x != i){
                    result = Array(x, i)
                    }
                case _ => map += v -> i
            }
        }
        result
    }
}
