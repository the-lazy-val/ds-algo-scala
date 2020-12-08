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
