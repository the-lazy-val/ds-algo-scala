object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        if(strs.isEmpty){
            ""
        }else{
            var flag = true
            var count = 1
            var output = ""
        
            var minLength = strs.map(_.length).min
        
        while(flag && count <= minLength){
            
            /**
            lst.forall(_ == lst.head)  // true  if empty or all the same
            lst.exists(_ != lst.head)  // false if empty or all the same
            */
            
            if(strs.map(s => s.substring(0, count)).distinct.length == 1){
                output = strs(0).substring(0, count)
                count += 1
            }else{
                flag = false
            }
        }
        
        output
        }
    }
}

//Alternate solution (better complexity)
object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        if(strs.isEmpty){
            ""
        }else{
            var prefix = strs(0)
            
            (1 until strs.length).map(i => {
                
                while(strs(i).indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length - 1)
                }
                
            })
            
            prefix
        }
    }
}
