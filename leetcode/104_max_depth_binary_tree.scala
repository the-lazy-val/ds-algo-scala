/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def maxDepth(root: TreeNode): Int = root match {
        case null => 0
        case x: TreeNode => Math.max((1 + maxDepth(x.left)), (1 + maxDepth(x.right)))
    }
}
