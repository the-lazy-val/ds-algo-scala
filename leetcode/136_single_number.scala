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
object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        nums.reduce(_ ^ _)
    }
}
