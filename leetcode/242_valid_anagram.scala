//Time complexity( O(NlogN + N))
object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        var arr1 = s.toArray
        var arr2 = t.toArray
        if(arr1.size != arr2.size){
            false
        } else{
            java.util.Arrays.sort(arr1)
            java.util.Arrays.sort(arr2)
            
            var flag = true
            import scala.util.control.Breaks._
            var index = 0
            breakable{
            while(index < arr1.size){
                if(arr1(index) != arr2(index)){
                    flag = false
                    break
                }
                index += 1
            }
            }
            flag
        }
    }
}
