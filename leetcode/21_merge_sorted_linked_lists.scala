/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        if(l1 == null){
            l2
        } else if(l2 == null){
            l1
        }else{
            var (ll1, ll2) = (l1, l2)
            var firstNext = if(ll1.x < ll2.x) ll1 else ll2
            var head = ListNode(0, firstNext)
            var curr = head
            
            
            while(ll1 != null && ll2 != null){
                if(ll1.x < ll2.x){
                    curr.next = ll1
                    curr = ll1
                    ll1 = ll1.next
                } else{
                    curr.next = ll2
                    curr = ll2
                    ll2 = ll2.next
                }
            }
            
            if(ll1 == null){
                curr.next = ll2
            }else{
                curr.next = ll1
            }
            
            head.next
        }
    }
}


//Alternate & Simpler solution
/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if(l1 == null) return l2
    if(l2 == null) return l1

    if (l1.x < l2.x) {
      l1.next = mergeTwoLists(l1.next, l2)
      l1
    } else {
      l2.next = mergeTwoLists(l1, l2.next)
      l2
    }
  }
}
