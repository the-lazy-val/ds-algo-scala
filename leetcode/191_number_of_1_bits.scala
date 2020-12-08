object Solution {
    // you need treat n as an unsigned value
    def hammingWeight(n: Int): Int = {
        n.toBinaryString.toCharArray.filter(_ == '1').length
    }
}
