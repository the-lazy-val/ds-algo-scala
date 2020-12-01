object Test extends App {
  
  def minDiffHeight(input: Array[Int], n: Int, k: Int): Int ={
    var arr = input
    arr.map(println)
    scala.util.Sorting.quickSort(input)
    println("----")
    arr.map(println)
    
    val ans = arr(n-1) - arr(0)
    println("----")
    println(ans)
    
    var small = arr(0) + k
    var big = if(arr(n-1) - k > 0) arr(n-1) - k else arr(n-1)
    println("----")
    println(small)
    println(big)
    
    if(small > big){
      val temp = small
      small = big
      big = temp
    }
    
    println("----")
    println(small)
    println(big)
    
    (1 to n-2).map(i => {
      val sub = if(arr(i) - k > 0) arr(i) - k else arr(i)
      val add = arr(i) + k
      
      println("----")
      println("sub = " + sub)
      println("add = " + add)
      
      if((sub > small) || (add < big)){
        
      }else{
        if(add - small < big - sub){
         big = add
        }else{
         small = sub
        }
      }
      println("----")
      println(small)
      println(big)
    })
    
    val output = Math.min(ans, big - small)
    output
  }
  
  val input = Array(12, 9, 3, 16, 20)
   
  val output = minDiffHeight(input, 5, 3)
  println(output)
}
