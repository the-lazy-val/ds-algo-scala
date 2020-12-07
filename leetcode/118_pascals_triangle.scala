object Solution {
    def generate(numRows: Int): List[List[Int]] = {
        var output = List.empty[List[Int]]
        var curr = 1
        if(numRows == 0){
            output
        }else{
            while(curr <= numRows){
                curr match{
                    case 1 => output = List(List(1))
                    case _ => {
                        val prev = output(curr-2)
                        val begin = 0
                        val end = curr - 1
                        val row = 
                        (0 to curr-1)
                        .map(i => if(i == begin || i == end) 1 else prev(i)+prev(i-1))
                        .toList
                        
                        output = output :+ row
                    }
                }
                curr += 1
            }
        }
        output
    }
}
