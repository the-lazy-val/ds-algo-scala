object Solution {
    def isPowerOfThree(n: Int): Boolean = {
    
        //log x to base 3 = (log x to base 10) / (log 3 to base 10)
        
        def log3(x: Double) = Math.log10(x)/Math.log10(3.0)
        
        (log3(n) % 1) == 0
        
    }
}

//Alternate solution
object Solution {
    def isPowerOfThree(n: Int): Boolean = {
        n match{
            case z if z<=0 => false
            case 1 => true
            case z if z%3!=0 => false
            case z => isPowerOfThree(n/3)
        }
    }
}
