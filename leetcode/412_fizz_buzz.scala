object Solution {
    def fizzBuzz(n: Int): List[String] = {
        (1 to n).map(num => {
            if(num%15 == 0)
                "FizzBuzz"
            else if(num%5 == 0)
                "Buzz"
            else if(num%3 == 0)
                "Fizz"
            else
                num.toString
        }).toList
    }
}
