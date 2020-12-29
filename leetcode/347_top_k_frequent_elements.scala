object Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
        var hm = scala.collection.mutable.Map.empty[Int, Int]
        for(elem <- nums){
            hm.get(elem) match{
                case Some(count) => hm += (elem -> (count+1))
                case None => hm += (elem -> 1)
            }
        }
        hm.toList.sortBy(x => (x._2)*(-1)).take(k).map(_._1).toArray
    }
}
