object Test extends App {
  
  def kadanes(input: List[Int]): Int ={
    var maxEndingHere = 0
    var maxSoFar = Int.MinValue
    
    for(elem <- input){
      maxEndingHere = maxEndingHere + elem
      if(maxEndingHere < elem){
        maxEndingHere = elem
      }
      if(maxEndingHere > maxSoFar){
        maxSoFar = maxEndingHere
      }
    }
    
    maxSoFar
  }
  
  val input = List(-2, -3, 4, -1, -2, 1, 5, -3)
   
  val output = kadanes(input)
  println(output)
}
