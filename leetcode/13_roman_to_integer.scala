object Solution {
    def romanToInt(s: String): Int = {
        val exceptionsMap = Map(
            ('I' -> List('V', 'X')),
            ('X' -> List('L', 'C')),
            ('C' -> List('D', 'M'))
                     )
        
        val valuesMap = Map(
            ('I' -> 1),
            ('V' -> 5),
            ('X' -> 10),
            ('L' -> 50),
            ('C' -> 100),
            ('D' -> 500),
            ('M' -> 1000)
        )
        
        val exceptionalValues = Map(
            ("IV" -> 4),
            ("IX" -> 9),
            ("XL" -> 40),
            ("XC" -> 90),
            ("CD" -> 400),
            ("CM" -> 900)
        )
        
        var sum = 0
        var i = 0
        val len = s.length
        while(i < len){
            var c1 = s.charAt(i) 
            c1 match{
                case 'I' | 'X' | 'C' => {
                    if(i+1 < s.size && exceptionsMap.get(c1).get.contains(s.charAt(i+1))){
                        sum += exceptionalValues.get(c1.toString + s.charAt(i+1)).get
                        i+=2
                    }else{
                        sum += valuesMap.get(c1).get
                        i += 1
                    }
                }
                case _ => {
                    sum += valuesMap.get(c1).get
                    i += 1
                }
            }
        }
        sum
    }
}


//Alternate SCALA solution
object Solution {
	def convert(c: Char) = c match{
		case 'I' => 1
		case 'V' => 5
		case 'X' => 10
		case 'L' => 50
		case 'C' => 100
		case 'D' => 500
		case 'M' => 1000
		case _ => throw new UnsupportedOperationException("This case should not be called unless the input is invalid")
	}

	def romanToInt(s: String): Int = s.foldRight(0){
		(v, sum) => (convert(v), sum) match{
			case (add, _) if sum < 5*add => add + sum
			case (sub, _) => sum - sub
		}
	}
	
}
