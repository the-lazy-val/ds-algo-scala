
object Solution {
    var x = 0
    var result = 0
    
    //Using inorder and maintaining count
    
    def findk(root: TreeNode, k: Int): Unit = {
        if(root == null){
            ()
        }
        else if(root.left == null && root.right == null){
            x = x+1
            if(x == k) result = root.value
        }else if(root.left == null){
            x = x+1
            if(x == k) result = root.value
            findk(root.right, k)
        }else if(root.right == null){
            findk(root.left, k)
            x = x+1
            if(x == k) result = root.value
        }else{
            findk(root.left, k)
            x = x+1
            if(x == k) result = root.value
            findk(root.right, k)
        }
    }
    
    def kthSmallest(root: TreeNode, k: Int): Int = {
        x=0
        result=0
        findk(root, k)
        result
    }
}
