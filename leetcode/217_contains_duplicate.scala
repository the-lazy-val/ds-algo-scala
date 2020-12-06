object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        var hashSet = scala.collection.mutable.HashSet.empty[Int]
        import scala.util.control.Breaks._
        var flag = false
        breakable{
            for(num <- nums){
                if(hashSet.contains(num)){
                        flag = true
                        break
                    }else{
                    hashSet.add(num)
                }
                }
            }
        flag
        }
    }
    
  
