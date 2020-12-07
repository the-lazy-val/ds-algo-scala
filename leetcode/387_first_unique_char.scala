object Solution {
    def firstUniqChar(s: String): Int = {
        var map = scala.collection.mutable.Map.empty[Char, (Int, Int)]
        (0 to s.length-1).map(i =>
            map.get(s.charAt(i)) match{
                case Some(indexAndCount) => map += (s.charAt(i) -> (i, indexAndCount._2 + 1))
                case None => map += (s.charAt(i) -> (i, 1))
            }
        )
        map.toList.filter(x => x._2._2 == 1).map(_._2._1).sorted.headOption.getOrElse(-1)
    }
}

//Alternate/Better SCALA solution
object Solution {
    def firstUniqChar(s: String): Int = {
        val hmap =  s.toCharArray.groupBy(identity).mapValues(_.length)
        val uniqChar = s.toCharArray.zipWithIndex.find (p => hmap(p._1) == 1)
        if(uniqChar.nonEmpty) uniqChar.get._2 else -1 
    }
}
