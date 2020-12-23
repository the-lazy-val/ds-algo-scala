//Backtracking approach
//Memory limit exceeds from n=6
//works till n=5

object Solution {
    var output = scala.collection.mutable.Set.empty[String]
    var qualified = scala.collection.mutable.Set.empty[String]
    
    def isBalanced(chars: Array[Char]): Boolean = {
        var count = 0
        var flag = true
        var stack = scala.collection.mutable.Stack[Char]()
        
        stack.pushAll(chars)
        
        import scala.util.control.Breaks._
        
        breakable{
            while(!stack.isEmpty){
                val pop = stack.pop()
                if(count <= 0 && pop == '('){
                    flag = false
                    break
                }else if(pop == ')'){
                    count += 1
                }else{
                    count -= 1
                }
            }
        }
         
        if(flag && count == 0){
            true
        }else{
            false
        }
    }
    
    def backtrack(chars: Array[Char], l: Int, r: Int): Unit = {
        
        def swap(a: Int, b: Int) = {
            val temp = chars(a)
            chars(a) = chars(b)
            chars(b) = temp
        }
        
        
        if(l == r){
            val str = chars.mkString
            if(! qualified.contains(str)){
                qualified.add(str)
                if(isBalanced(chars)){
                    output.add(str)
                }
            }
        }else{
                (l to r).map(i => {
                swap(l, i)
                backtrack(chars, l+1, r)
                swap(l, i) //backtrack step
                })
        }
    }
    
    def generateParenthesis(n: Int): List[String] = {
        output = scala.collection.mutable.Set.empty[String]
        qualified = scala.collection.mutable.Set.empty[String]
        
        val inputString = (1 to n).map(_ => '(').mkString + (1 to n).map(_ => ')').mkString
        var inputCharArray = inputString.toCharArray
        
        backtrack(inputCharArray, 0, n+n-1)
        
        output.toList
    }
}


/**
In the above approach, what we are basically doing is getting all possible combinations and then filtering the ones that are balanced.
that is kinda brute force actually
In the below approach (also backtracking), we apply constraints, during forming the string itself
*/

object Solution {
    
    def generateParenthesis(n: Int): List[String] = {
        import scala.collection.mutable._
        def backtrack(acc: ListBuffer[String], curr: String, left: Int, right: Int): Unit = {
            if (left == 0 && right == 0) acc.append(curr)
            else {
                if (left > 0) backtrack(acc, curr + "(", left-1, right)
                if (right > left) backtrack(acc, curr + ")", left, right-1)
            }
        }
      
        val acc = ListBuffer[String]()
        backtrack(acc, "", n, n)
        acc.toList
    }
}
