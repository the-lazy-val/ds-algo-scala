/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def isPalindrome(head: ListNode): Boolean = {
        var flag = true
        var rev = head
        var h = head
        def reverse(n: ListNode): Unit = {
            if(n == null){
                ()
            }else{
                reverse(n.next)
                val cond = n.x == h.x
                flag = flag && cond
                h = h.next
            }
        }
       
        reverse(rev)
        flag
    }
}
