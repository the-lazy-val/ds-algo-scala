object Solution {
    def plusOne(digits: Array[Int]): Array[Int] = {
        var size = digits.length
        var add = 1
        
        var output = List.empty[Int]
        
        (0 to (size-1)).reverse.map(i => {
            
            val x = digits(i)
            
            if(x == 9 && add == 1 && i == 0){
                output = List(1, 0) ++ output
            }else if(x == 9 && add == 1){
                output = 0 +: output
            }else{
                if(add == 1){
                    output = (x+1) +: output
                    add = 0
                }else{
                    output = x +: output
                }
            }
        })
        output.toArray
    }
}
