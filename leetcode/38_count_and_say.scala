object Solution {
    def countAndSay(n: Int): String = {
        if(n == 1){
            "1"
        }else{
            val prev = countAndSay(n-1)
            val prevIntArray = prev.toCharArray.map(x => x - '0')
            
            var output = ""
            var count = 0
            if(!prevIntArray.isEmpty){
                var element = prevIntArray(0)
            
                for(elem <- prevIntArray){
                    if(elem == element){
                        count += 1
                    }else{
                        output = output + count + element
                        element = elem
                        count = 1
                    }
                }
                output = output + count + element
            }
            
            output
        }
    }
}


//Just using StringBuilder put the solution from 16% -> 93.5% in terms of time efficiency

object Solution {
    def countAndSay(n: Int): String = {
        if(n == 1){
            "1"
        }else{
            val prev = countAndSay(n-1)
            val prevIntArray = prev.toCharArray.map(x => x - '0')
            
            var output = new scala.collection.mutable.StringBuilder()
            var count = 0
            if(!prevIntArray.isEmpty){
                var element = prevIntArray(0)
            
                for(elem <- prevIntArray){
                    if(elem == element){
                        count += 1
                    }else{
                        output.append(count)
                        output.append(element)
                        element = elem
                        count = 1
                    }
                }
                output.append(count)
                output.append(element)
            }
            
            output.toString
        }
    }
}
