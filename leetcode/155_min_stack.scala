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

//Alternate solution: much faster
//Here we are prepending elements to the list instead of appending
//Note that since List is actually a LinkedList its much easier to deal with "head" of the list
//There is also another list to maintain min elements of the list
class MinStack() {

    /** initialize your data structure here. */
    var stack = List.empty[Int]
    var mins = List.empty[Int]

    def push(x: Int) {
        //this line fails if we make second condition as x < mins.head
        //with NoSuchElementException: head of empty list
        //why???
        if(mins.isEmpty || mins.head >= x) mins = x +: mins
        stack = x +: stack
    }

    def pop() {
        if(mins.head == stack.head) mins = mins.tail
        stack = stack.tail
    }

    def top(): Int = {
        stack.head
    }

    def getMin(): Int = {
        mins.head
    }

}
