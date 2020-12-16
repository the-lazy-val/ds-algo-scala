object Solution {
    // you need treat n as an unsigned value
    def reverseBits(x: Int): Int = {
        var binaryString = x.toBinaryString.toList
        
        var additional = (1 to (32 - binaryString.length)).map(_ => '0').toList
        
        binaryString = additional ++ binaryString
        
        val reversed = reverseBinary(binaryString, "")
        
        Integer.parseUnsignedInt(reversed.mkString, 2)
    }
    
    def reverseBinary(x: List[Char], str: String): String = x match{
        case Nil => str
        case x::xs => reverseBinary(xs, x + str)
    }
}
