/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
    def hasCycle(head: ListNode): Boolean = {
        var ha = head
        if(ha == null){
            false
        }else if(ha.next == null){
            false
        }else{
            var hs = scala.collection.mutable.HashSet.empty[ListNode]
            var flag = true
            var output = false
            while(flag){
                if(hs.contains(ha)){
                    flag = false
                    output = true
                }else if(ha.next == null){
                    flag = false
                }else{
                    hs.add(ha)
                    ha = ha.next
                }
            }
            output
        }
    }
}

//Alternate solution: Slow & Fast pointer
object Solution {
    def hasCycle(head: ListNode): Boolean = {
        
        if(head == null){
            false
        }else{
        
        var slow = head
        var fast = head.next
        var output = true
        
        import scala.util.control.Breaks._
        breakable{
            while(slow != fast){
                if(fast == null || fast.next == null){
                    output=false
                    break
                }
                slow = slow.next
                fast = fast.next.next
            }
        }
        output
    }
    }
}
