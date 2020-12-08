object Solution {
    
    def climbStairs(n: Int): Int = {
        if(n==1){
            1
        }else if(n == 2){
            2
        }else{
            climbStairs(n-1) + climbStairs(n-2)
        }
    }
}

/**
n = 3
1 1 1
1 2
-------
2 1
==================> 2 + 1
n = 4
 1 1 1 1
 1 1 2
 1 2 1
 --------
 2 1 1
 2 2
 =================> 3 + 2
*/

/**Alternate approach:
In the above approach we are doing repeated call for some numbers
example: 
climbStairs(5) -> 4 & 3
climbStairs(4) -> 3 & 2 | climbStairs(3) -> 2 & 1
climbStairs(3) -> 2 & 1 | climbStairs(2) | climbStairs(2) | climbStairs(1)
climbStairs(2) | climbStairs(1) | climbStairs(1)

To avoid recalculation again & again we can just store the results for the previous numbers at their indexes
*/
object Solution {
    
    def climbStairs(n: Int): Int = {
        if(n == 1){
            1
        }else{
            var dpArray = Array.fill(n+1)(0)
            dpArray(1) = 1
            dpArray(2) = 2
            (3 to n).map(i => {
                dpArray(i) = dpArray(i-1) + dpArray(i-2)
            })
            dpArray(n)
        }
    }
}
