object Solution {
    def reverseString(s: Array[Char]): Unit = {
        var begin = 0
        var end = s.length - 1
        while(begin < end){
            var temp = s(begin)
            s(begin) = s(end)
            s(end) = temp
            
            begin += 1
            end -= 1
        }
    }
}
