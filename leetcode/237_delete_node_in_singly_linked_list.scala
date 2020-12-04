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
