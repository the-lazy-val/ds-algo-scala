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

/**How the above solution works:
scala> val a = "akashs"
a: String = akashs

scala> a.toCharArray.groupBy(identity)
res0: scala.collection.immutable.Map[Char,Array[Char]] = Map(h -> Array(h), k -> Array(k), s -> Array(s, s), a -> Array(a, a))

scala> a.toCharArray.groupBy(identity).mapValues(_.length)
res1: scala.collection.immutable.Map[Char,Int] = Map(h -> 1, k -> 1, s -> 2, a -> 2)

scala> a.toCharArray.zipWithIndex
res2: Array[(Char, Int)] = Array((a,0), (k,1), (a,2), (s,3), (h,4), (s,5))

scala> a.toCharArray.zipWithIndex.find(x => res1(x._1) == 1)
res3: Option[(Char, Int)] = Some((k,1))
*/
