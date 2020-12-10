class MinStack() {

    /** initialize your data structure here. */
    var stack = List.empty[Int]
    var min = Int.MaxValue

    def push(x: Int) {
        stack = stack :+ x
        if(x < min){
            min = x
        }
    }

    def pop() {
        stack = stack.init
        min = Int.MaxValue
        stack.map(x => {
            if(x < min) min = x
        })
    }

    def top(): Int = {
        stack.last
    }

    def getMin(): Int = {
        min
    }

}
