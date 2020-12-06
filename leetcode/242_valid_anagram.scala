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

//Time complexity O(n)
object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        var arr1 = s.toArray
        var arr2 = t.toArray
        
        if(arr1.size != arr2.size){
            false
        } else{
            var map = scala.collection.mutable.Map.empty[Char, Int]
            for(elem <- arr1){
                map.get(elem) match{
                    case Some(count) => map += (elem -> (count+1))
                    case None => map += (elem -> 1)
                }
            }
            
            for(elem <- arr2){
                map.get(elem) match{
                    case Some(count) if count == 1 => map.remove(elem)
                    case Some(count) => map += (elem -> (count-1))
                    case None => ()
                }
            }
            
            if(map.keys.isEmpty) true else false
        }
    }
}

//One more: O(N)
object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        if(s.size != t.size){
            false
        }else{
        var arr = Array.fill(26)(0)
        for(elem <- s){
            arr(elem - 'a') += 1
        }
        
        import scala.util.control.Breaks._
        var flag = true
        breakable{
        for(elem <- t){
            arr(elem - 'a') -= 1
            if(arr(elem - 'a') < 0){
                flag = false
                break
            }
        }
        }
        flag
    }
    }
}
