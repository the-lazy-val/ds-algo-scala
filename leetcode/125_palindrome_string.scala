object Solution {
    def isPalindrome(s: String): Boolean = {
        val str = s.filter(c => c.isLetter || c.isDigit).toUpperCase
        if(str.isEmpty){
            true
        }else{
            var flag = true
            var head = 0
            var tail = str.length - 1
            
            import scala.util.control.Breaks._
            breakable{
            while(head <=  tail){
                if(str(head) != str(tail)){
                    flag = false
                    break
                }
                head +=1
                tail -=1
            }
            }
            flag
        }
        
    }
}
