/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    
    def symmetric(nodeA: TreeNode, nodeB: TreeNode): Boolean = {
        if(nodeA == null && nodeB == null){
            true
        }else if(nodeA !=null && nodeB != null){
            if(nodeA.value != nodeB.value){
                false
            }else{
                symmetric(nodeA.left, nodeB.right) && symmetric(nodeA.right, nodeB.left)
            }
        }else{
            false
        }
    }
    
    def isSymmetric(root: TreeNode): Boolean = {
        if(root == null){
            true
        } else{
            symmetric(root.left, root.right)
        }
    }
}
