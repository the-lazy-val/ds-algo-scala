object Test extends App{
  def merge(input1: Array[Int], input2: Array[Int], n: Int, m: Int) = {
    var (end, begin, small, big) = if(n < m) (n-1, 0, input1, input2) else (m-1, 0, input2, input1)
    import util.control.Breaks._
    breakable{
      while(end > 0){
      if(small(end) > big(begin)){
        var temp = small(end)
        small(end) = big(begin)
        big(begin) = temp
        end -= 1
        begin += 1
      } else{
        break()
      } 
    }
    }
    
    java.util.Arrays.sort(small)
    java.util.Arrays.sort(big)
    
    println(small.mkString(", "))
    println(big.mkString(", "))
  }
  
  merge(Array(10, 12), Array(5, 18, 20), 2, 3)
}
