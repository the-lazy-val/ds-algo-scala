object Solution {
    def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        
        val map1 = nums1.groupBy(identity).mapValues(_.length)
        val map2 = nums2.groupBy(identity).mapValues(_.length)
        
        val keys = map1.keySet intersect map2.keySet
        
        keys.map(key => {
            val count1 = map1.get(key).get
            val count2 = map2.get(key).get
            val count = if(count1 > count2) count2 else count1
            Array.fill(count)(key)
        }).toArray.flatten
    }
}


//Alternate solution to keep count in HashMap from 1st array & decrease from second array... whatever is left is intersection
object Solution {
    def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        var map = scala.collection.mutable.Map.empty[Int, Int]
        var output = List.empty[Int]
        for(item <- nums1){
            map.get(item) match{
                case Some(count) => map += (item -> (count + 1))
                case None => map += (item -> 1)
            }
        }
        
        for(item <- nums2){
            map.get(item) match{
                case Some(count) => {
                    output = output :+ item
                    if(count - 1 == 0) map.remove(item) else map += (item -> (count - 1))
                }
                case None => map.remove(item)
            }
        }
        
        output.toArray
    }
}
