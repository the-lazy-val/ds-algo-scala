object Solution {
    var output = List.empty[List[Int]]
    
    def backtrack(nums: Array[Int], l: Int, r: Int): Unit = {
        def swap(a: Int, b: Int) = {
            val temp = nums(a)
            nums(a) = nums(b)
            nums(b) = temp
        }
        
        /**
        In backtracking, we collect all the leaf nodes of the tree
        In this question, we fix the first letter and swap the others till we reach (l==r), i.e. no swap needed since its the leaf node
        So we add it to output
        */
        
        if(l == r){
            output = output :+ nums.toList
        }else{
            (l to r).map(i => {
                swap(l, i)
                backtrack(nums, l+1, r)
                swap(l, i) //backtrack step
            })
        }
    }
    
    def permute(nums: Array[Int]): List[List[Int]] = {
        output = List.empty[List[Int]]
        var input = nums
        backtrack(input, 0, input.length - 1)
        output
    }
}
