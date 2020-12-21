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
