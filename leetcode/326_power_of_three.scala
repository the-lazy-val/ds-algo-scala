object Solution {
    def isPowerOfThree(n: Int): Boolean = {
    
        //log x to base 3 = (log x to base 10) / (log 3 to base 10)
        
        def log3(x: Double) = Math.log10(x)/Math.log10(3.0)
        
        (log3(n) % 1) == 0
        
    }
}
