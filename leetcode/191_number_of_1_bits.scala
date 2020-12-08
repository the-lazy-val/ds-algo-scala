object Solution {
    // you need treat n as an unsigned value
    def hammingWeight(n: Int): Int = {
        n.toBinaryString.toCharArray.filter(_ == '1').length
    }
}

//Alternate bit-wise shift and count 1
def hammingWeight(n: Int): Int = {
        var count = 0
        var num   = n

        while (num != 0) {
            if ((num & 1) > 0) { count = count + 1 }
            num = num >>> 1
        }
    count
}

//Alternate (need to understand whats happening here) AND of num, num-1
def hammingWeight(n: Int): Int = {
        println(n)
        var sum = 0
        var num = n         
        while (num != 0) {
            sum += 1
            num &= (num-1)                
        }
        sum
    }
