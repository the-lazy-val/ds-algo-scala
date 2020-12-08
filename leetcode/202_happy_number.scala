object Solution {
    
    def getDigitSquaresSum(num: Int) = {
        num.toString.map(_.asDigit).map(x => x*x).foldLeft(0)(_ + _)
    }
    
    def isHappy(n: Int): Boolean = {
        var num = n
        var set = scala.collection.mutable.HashSet.empty[Int]
        var flag = true
        while(flag){
            if(num == 1){
                flag = false
            }else if(set.contains(num)){
                flag = false
            }else{
                set.add(num)
                num = getDigitSquaresSum(num)
            }
        }
        
        num == 1
    }
}
