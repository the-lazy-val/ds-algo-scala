object Test extends App{
  def findDuplicate(nums: Array[Int]): Int = {
    val n = nums.length - 1
    val sum1ToN = (n * (n+1)) / 2
    val arraySum = nums.foldLeft(0)(_ + _)
    arraySum - sum1ToN
  }
  
  val output = findDuplicate(Array(3,1,3,4,2))
  println(output)
}
