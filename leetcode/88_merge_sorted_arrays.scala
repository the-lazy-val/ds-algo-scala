object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        var trail = m+n-1
        
        var t1 = m-1
        var t2 = n-1
        
        while(t1 > -1 && t2 > -1){
            val e1 = nums1(t1)
            val e2 = nums2(t2)
            
            if(e1 > e2){
                nums1(trail) = e1
                t1 -= 1
                trail -= 1
            }else{
                nums1(trail) = e2
                t2 -= 1
                trail -= 1
            }
        }
        
        if(t1 == -1){
            while(t2 > -1){
                nums1(trail) = nums2(t2)
                t2 -= 1
                trail -= 1
            }
        }else{
            while(t1 > -1){
                nums1(trail) = nums1(t1)
                t1 -= 1
                trail -= 1
            }
        }
        
    }
}
