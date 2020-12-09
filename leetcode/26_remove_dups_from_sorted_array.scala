object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        if(nums.length == 0){
            0
        }else{
            var head = 0
            var find = 1
            while(find < nums.length){
                if(nums(find) != nums(head)){
                    head += 1
                    nums(head) = nums(find)
                }
                find += 1
            }
            head + 1
        }
    }
}
