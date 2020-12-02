import scala.util.control.Breaks._

def findMaxJump(input: Array[Int], begin: Int, end: Int) = {
  
  println(s"begin = $begin")
  println(s"end = $end")
  
  var max = input(begin)
  var maxIndex = begin
  (begin+1 to end).map(index =>{
    if(input(index) >= max){
      maxIndex = index
      max = input(index)
    }
  })
  println(s"maxIndex = $maxIndex")
  println(s"max = $max")
  println("=========")
  (maxIndex, max)
}

def minJumps(input: Array[Int], n: Int): Int = {
  var arr = input
  var current = 0
  var leftDistance = n-1
  var steps = 0
  
  breakable{
    while(leftDistance > 0){
      var reach = arr(current)
      
      if(reach == 0){
        steps = -1
        break()
      }
      
      steps += 1
      var temp = findMaxJump(arr, current+1, current + reach)
      current = temp._1
      leftDistance -= temp._2
    }
  }
  
  steps
}

val output = minJumps(Array(1,4,3,2,6,7), 6)
println(output)
