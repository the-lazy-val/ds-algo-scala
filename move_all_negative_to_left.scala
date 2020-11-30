//Following the similar pointer implementation of sorting 0,1,2
//use 2 pointers here: start, end
//swap if arr(start) is +ve but arr(end) is -ve
//otherwise increment pointers
object Test extends App {
  
  def swap(arr: Array[Int], firstIndex: Int, secondIndex: Int) = {
    var temp = arr(firstIndex)
    arr(firstIndex) = arr(secondIndex)
    arr(secondIndex) = temp
    arr
  }
  
  def moveNegative(input: Array[Int]): Array[Int] = {
    var start = 0
    var end = input.length - 1
    
    var arr = input
    
    while(start < end){
      if(arr(start) < 0 && arr(end) < 0){
        start += 1
      }
      if(arr(start) > 0 && arr(end) < 0){
        arr = swap(arr, start, end)
        start += 1
        end -= 1
      }
      if(arr(start) > 0 && arr(end) > 0){
        end -= 1
      }
      if(arr(start) < 0 && arr(end) > 0){
        start += 1
        end -= 1
      }
    }
    arr
  }
  
  val input = Array(-2, 1, -4, -2, 5, 7, -3)
  val output = moveNegative(input)
  output.map(println)
}
