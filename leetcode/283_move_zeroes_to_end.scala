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

//Alternate solution: calculate the number of shifts 
object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        
        var zeroCount = 0
        //count of zero is amount character is shifted to left
        //from first zero position traverse array left
        for(a <- 0 to nums.size-1){   
            //count zeroes and shift when not zero
            if(nums(a) == 0){
                zeroCount = zeroCount + 1
            }else if(zeroCount>0){
                //shift left if not 0 by zeroCount
                nums(a-zeroCount) = nums(a)
                nums(a) = 0
            }
        }
    }
}
