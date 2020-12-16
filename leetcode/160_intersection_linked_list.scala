/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
    
    def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
        if(headA == null){
            null
        }else if(headB == null){
            null
        }else{
            var ha = headA
        var hb = headB
        
        var hAsize = 0
        var hBsize = 0
        while(ha.next != null){
            hAsize += 1
            ha = ha.next
        }
        while(hb.next != null){
            hBsize += 1
            hb = hb.next
        }
        
        var first: ListNode = null
        var second: ListNode = null
        var diff = 0
        
        if(hAsize>hBsize){
            first = headA
            second = headB
            diff=hAsize-hBsize
        }else{
            first = headB
            second = headA
            diff=hBsize-hAsize
        }
        
        while(diff > 0){
            first = first.next
            diff -= 1
        }
        
        var result: ListNode = null
        import scala.util.control.Breaks._
        breakable{
        while(first!= null && second!= null){
            if(first == second){
                result = first
                break
            }
            first = first.next
            second = second.next
        }
        }
        
        result
        }
    }
}

//Alternate solution

/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
    
    def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
        var ha = headA
        var hb = headB
        
        while(ha != hb){
            if(ha == null){
                ha = headB
            }else{
                ha = ha.next
            }
            
            if(hb == null){
                hb = headA
            }else{
                hb = hb.next
            }
        }
        
        ha
    }
}
