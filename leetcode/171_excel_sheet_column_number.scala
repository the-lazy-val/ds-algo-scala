object Solution {
    def titleToNumber(s: String): Int = {
        var size = s.size
        var i = 0
        var sheetNumber = 0
        while(i < size){
            var sum = (s.charAt(i) - 'A' + 1) * Math.pow(26, (size - i-1)).toInt
            
            sheetNumber += sum
            i += 1
        }
        sheetNumber
    }
}


//Alternate solution
object Solution {
    def titleToNumber(s: String): Int = 
        s.foldLeft(0)((acc, ch) => acc * 26 + (ch - 'A' + 1))
}
