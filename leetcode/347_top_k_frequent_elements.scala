object Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
        var hm = scala.collection.mutable.Map.empty[Int, Int]
        for(elem <- nums){
            hm.get(elem) match{
                case Some(count) => hm += (elem -> (count+1))
                case None => hm += (elem -> 1)
            }
        }
        
        // hm.toList.sortBy(x => (x._2)*(-1)).take(k).map(_._1).toArray
        // The above is a sorting approach. We can use Heap/PriorityQueue to achieve better time complexity
        
        import scala.math.Ordering.Implicits._
        
        def orderByFrequency(tup: (Int, Int)) = tup._2
        
        val pq = new scala.collection.mutable.PriorityQueue[(Int, Int)]()(Ordering.by(orderByFrequency))
        
        for(entry <- hm){
            pq.enqueue(entry)
        }
        
        println(pq)
        (1 to k).map(_ => pq.dequeue).map(_._1).toArray
        
    }
}
