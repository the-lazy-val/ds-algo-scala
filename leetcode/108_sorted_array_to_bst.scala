/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    
    def formTree(nums: Array[Int], begin: Int, end: Int): TreeNode = {
        var mid = begin + Math.ceil((end - begin)/2).toInt
        TreeNode(
            nums(mid), 
            if(mid <= begin) null else formTree(nums, begin, mid-1), 
            if(mid >= end) null else formTree(nums, mid+1, end)
        )
    }
    
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        if(nums.isEmpty){
            null
        }else{
            formTree(nums, 0, nums.size - 1)
        }
    }
}
