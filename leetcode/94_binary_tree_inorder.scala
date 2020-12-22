/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    
    def inorderTraversal(root: TreeNode): List[Int] = {
        if(root == null){
            List.empty[Int]
        }
        else if(root.left == null && root.right == null){
            List(root.value)
        }else if(root.left == null){
            List(root.value) ++ inorderTraversal(root.right)
        }else if(root.right == null){
            inorderTraversal(root.left) ++ List(root.value)
        }else{
            inorderTraversal(root.left) ++ List(root.value) ++ inorderTraversal(root.right)
        }
    }
}
