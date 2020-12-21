object Solution {
    def countPrimes(n: Int): Int = {
        
        //Sieve of Eratosthenes
        
        var primeArray = Array.fill(n)(false)
        (2 until n).map(i => primeArray(i) = true)
        
        //We need to check for all numbers i, where i < sqrt(n)
        //To avoid doing sqrt operation again & again (since its expensive)
        //We can do i*i < n
        
        var i =2
        while(i*i < n){
            if(primeArray(i)){
                var j = i*i
                while(j < n){
                    primeArray(j) = false
                    j += i //because we are only checking multiple of i for each i in iteration
                }
            }
            i+=1
        }
        
        primeArray.filter(x => x).length
    }
}
