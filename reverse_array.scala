object Test extends App {
  def reverse(arr: List[Int], reversed: List[Int] = List.empty[Int]): List[Int] = arr match{
    case Nil => Nil
    case x::Nil => x +: reversed
    case x::xs => reverse(xs, x +: reversed)
  }
  
  val input = List(1,2,3,4)
  val output = reverse(input)
  println(output)
}
