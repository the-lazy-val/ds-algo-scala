object Test extends App {
  
  def rotateByOne(input: List[Int], output: List[Int]): List[Int] =
    input match {
    case Nil => Nil
    case x::Nil => x +: output
    case x::xs => rotateByOne(xs, output :+ x)
  }
  
  val input = List(1,9,7,4,5,3,10)
   
  var output = rotateByOne(input, List.empty[Int])
  output.map(println)
}
