object Solution {
    def strStr(haystack: String, needle: String): Int = {
        if(needle.isEmpty){
            0
        }else if(haystack.isEmpty){
            -1
        }else{
            var needleLength = needle.length
            var head = 0
            var end = head + needleLength
            var flag = true
            
            while(flag && (end <= haystack.length)){
                if(needle.equals(haystack.substring(head, end))){
                    flag = false
                }else{
                    head += 1
                    end += 1
                }
            }
            
            if(flag) -1 else head
        }
    }
}
