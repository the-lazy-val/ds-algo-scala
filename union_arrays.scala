object Test extends App {
  
  def unionArrays(input1: Array[Int], input2: Array[Int]): Array[Int] = {
    /*First Method
    */
    // var hashSet = scala.collection.mutable.HashSet.empty[Int]
    // hashSet ++= input1.toList
    // hashSet ++= input2.toList
    // hashSet.toArray
    
    /*Second Method
    */
    var map = scala.collection.mutable.Map.empty[Int, Int]
    // for(elem <- input1){
    //   map += (elem -> 0)
    // }
    // for(elem <- input2){
    //   map+= (elem -> 0)
    // }
    
    for(e1 <- input1; e2 <- input2){
      map += (e1 -> 0)
      map += (e2 -> 0)
    }
    
    map.keys.toArray
  }
  
  val input1 = Array(1,9,7,4,5,3,10)
  val input2 = Array(2,8,5,3,8,7)
  val output = unionArrays(input1, input2)
  output.map(println)
}
