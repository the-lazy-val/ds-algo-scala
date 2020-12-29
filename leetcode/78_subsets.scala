object Solution {
    //We either use or don't use the current item at the given index and continue until we are at the end of the array.
    
    def subsets(nums: Array[Int]): List[List[Int]] = {
        def backtrack(nums: List[Int], returnValue: List[Int]): List[List[Int]] = {
            nums
            .headOption
            .map(currentElem => 
                 backtrack(nums.tail, returnValue) ++ backtrack(nums.tail, currentElem +: returnValue))
            .getOrElse(List(returnValue))
        }
        
        backtrack(nums.toList, List.empty[Int])
    }
}
