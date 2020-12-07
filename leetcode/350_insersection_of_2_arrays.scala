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
