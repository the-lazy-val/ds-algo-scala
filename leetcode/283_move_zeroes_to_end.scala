object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        var p1 = 0
        var p2 = 0
        while(p1 < nums.size && p2 < nums.size){
            if(nums(p1) == 0 && nums(p2) != 0 && p1<p2){
                nums(p1) = nums(p2)
                nums(p2) = 0
                p1 += 1
                p2 += 1
            } else if(nums(p1) != 0 && nums(p2) != 0){
                p1 += 1
            }else{
                p2 += 1
            }
        }
    }
}
