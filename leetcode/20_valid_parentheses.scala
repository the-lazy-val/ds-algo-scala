object Solution {
    def isValid(s: String): Boolean = {
        if(s.length % 2 != 0){
            false
        }else{
        import scala.collection.mutable._
        val openingHashSet: HashSet[Char] = HashSet('(', '{', '[')
        val closingMap: Map[Char, Char] = Map(
             (')' -> '('),
             ('}' -> '{'),
             (']' -> '[')
         )                                                       
        val stack = Stack.empty[Char]
                       
        var output = true               
        import scala.util.control.Breaks._
        
        breakable{
            for(c <- s){
                if(stack.isEmpty){
                    if(openingHashSet.contains(c)){
                        stack.push(c)
                    }else{
                        output = false
                        break
                    }
                }else{
                    if(openingHashSet.contains(c)){
                        stack.push(c)
                    }else{
                        closingMap.get(c) match{
                            case Some(v) =>{
                                val top = stack.top
                                if(v == top){
                                    stack.pop()
                                }else{
                                    output = false
                                    break
                                }
                            }
                            case None =>{
                                output = false
                                break
                            }
                        }
                    }
                }
            }
        }               
        
        if(stack.isEmpty) output else false
    }
    }
}
