object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        var hashSet = scala.collection.mutable.HashSet.empty[Int]
        for(num <- nums){
            if(hashSet.contains(num)){
                hashSet.remove(num)
            }else{
                hashSet.add(num)
            }
        }
        
        hashSet.head
    }
}

//Alternate solution (not much time improvement)
/**
scala> 3 ^ 3
res0: Int = 0

scala> 3 ^ 4
res1: Int = 7

scala> 3 ^ 4 ^ 3
res2: Int = 4
*/
object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        nums.reduce(_ ^ _)
    }
}
