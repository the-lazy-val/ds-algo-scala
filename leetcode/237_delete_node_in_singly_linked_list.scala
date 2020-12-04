/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
    
    def getNext(node: ListNode): ListNode = {
        val nextNode = node.next
        if(nextNode == null)
            null
        else{
            node.x = nextNode.x
            node.next = getNext(nextNode)
            node
        }
    }
    
    def deleteNode(node: ListNode): Unit = {
        getNext(node)
    }
}

//The above solution can be simplified to:
object Solution {
    
    def deleteNode(node: ListNode): Unit = {
        node.x = node.next.x
        node.next = node.next.next //These 2 lines are effectively the same as doing the above recursion in scala
    }
}
