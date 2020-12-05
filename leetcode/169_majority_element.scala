object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        var map = scala.collection.mutable.Map.empty[Int, Int]
        for(elem <- nums){
            map.get(elem) match{
                case Some(count) => map += (elem -> (count+1))
                case None => map += (elem -> 1)
            }
        }
        
        map.toList.filter(_._2 > (nums.size / 2)).head._1
    }
}

//Alternate solution O(n) but NO EXTRA SPACE
object Solution {
    def majorityElement(nums: Array[Int]): Int = {     
        var current = nums.head
        var count = 0
        nums.foreach(num => {
            if(count == 0) { 
                current = num
                count = 0
            }
            if(num == current) count+=1;
            else count-=1;
        })
        
        current
    }
}
